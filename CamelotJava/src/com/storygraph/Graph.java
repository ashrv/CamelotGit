package com.storygraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.communication.UserInput;


/**
 * An object of this class represents a story graph
 * 
 * @author Alireza Shirvani
 * @see com.storygraph.Node
 * @see com.storygraph.Story
 */
public abstract class Graph extends UserInput<List<Edge>> {
	/**
	 * A list of all nodes in the story graph.
	 */
	protected List<Node> nodes = new ArrayList<>();
	/**
	 * Whenever a player choice is presented to the player, we keep track of them in
	 * this list.
	 */
	private List<Edge> enabledChoices = new ArrayList<>();
	/**
	 * The current node while traversing the graph from the root to a leaf.
	 */
	Node current;

	public Graph(List<String> labels) {
		try {
			for(var label: labels) {
				nodes.add(new Node(label.toString()));
			}
			root=nodes.get(0);
			getEdgeBuilder().build();
			getNodeBuilder().build();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Write a new class that extends NodeBuilder. In that class, write down a
	 * method for each node that adds Camelot actions to execute when visiting that
	 * node. Those methods must have a BuilderMethod annotation.
	 * 
	 * @return An instance of a class extending NodeBuilder that sets the actions
	 *         sequences of each node.
	 */
	protected abstract NodeBuilder getNodeBuilder();

	/**
	 * Write a new class that extends NodeBuilder. In that class, write down a
	 * method for each node that adds the edges of that node. Those methods must
	 * have a BuilderMethod annotation.
	 * 
	 * @return An instance of a class extending NodeBuilder that sets the edges of
	 *         each node.
	 */
	protected abstract NodeBuilder getEdgeBuilder();

	/**
	 * Represents the root of the graph
	 */
	private Node root;
	/**
	 * This method first executes the action sequence corresponding to the current
	 * node. It then enables and disables player choices based on the outgoing edges
	 * of the current node and waits for the player to make a choice. After a choice
	 * is made, it returns the next node of the graph following the edge that
	 * corresponds to that choice.
	 * 
	 * @return After the player makes a choice, follows the corresponding edge and
	 *         returns the node at the end of that edge.
	 * @throws Exception Throws an exception if the map does not contain an action
	 *                   sequence for the current node. It also It throws an
	 *                   exception if the action sequence fails to execute
	 *                   completely.
	 */
	public Node traverse() throws Exception {
		if (root == null)
			return null;
		if (current == null) {
			current = root;
		}
		// execute current node's sequence
		var sequence = current.getSequence();
		if (sequence != null)
			sequence.execute();
		else
			throw new Exception("map must contain the label " + current.toString());

		// wait for input and return the next node
		var possibleOptions = current.getOutgoingEdges();
		Node nextNode = null;

		if (possibleOptions != null) {
			disablePreviousChoices(possibleOptions);
			enableNewChoices(possibleOptions);
			var input = waitFor(enabledChoices);
			var edge = getEdge(input, enabledChoices).get();
			nextNode = current.getNextNode(edge);
		}
		current = nextNode;
		return current;
	}

	/**
	 * Executes an action sequence that enables the player choices specified by
	 * choices.
	 * 
	 * @param choices This list specifies what player choices need to be enabled at
	 *                the current node.
	 * @throws Exception 
	 */
	private void enableNewChoices(List<Edge> choices) throws Exception {
		enabledChoices = choices;
		var enableSequence = new EnablePlayerOptionsSequence(enabledChoices);
		enableSequence.execute();
	}

	/**
	 * Executes an action sequence that disables the player choices that were
	 * enabled in the previous node.
	 * 
	 * @param choices This list specifies what player choices were enabled in the
	 *                previous node.
	 * @throws Exception 
	 */
	private void disablePreviousChoices(List<Edge> choices) throws Exception {
		var disableSequence = new DisablePlayerOptionsSequence(enabledChoices);
		disableSequence.execute();

	}

	protected boolean checkFormat(String msg, List<Edge> edges) {
		return getEdge(msg, edges).isPresent();
	}
	
	private Optional<Edge> getEdge(String msg, List<Edge> edges) {
		return edges.stream().filter(t -> t.getChoice().getInputMsg().equals(msg)).findFirst();
	}

}
