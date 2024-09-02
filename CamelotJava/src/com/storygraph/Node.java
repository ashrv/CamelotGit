package com.storygraph;

import java.util.ArrayList;
import java.util.List;

import com.actions.IAction;
import com.sequences.ActionSequence;
/**
 * This class represents a node and its edges in the story graph.
 * @author Alireza Shirvani
 * @see com.playerInput.IPlayerChoice
 */
public class Node{
	private String name;
	/**
	 * This hashtable represents the children of this node that are connected to it via outgoing edges (player choices)
	 */
	private List<Edge> edges;
	/**
	 * The sequence of Camelot actions executed in this node
	 */
	private ActionSequence sequence;
	/**
	 * The constructor
	 * @param name The label of this node
	 */
	public Node(String name) {
		this.name = name;
		this.sequence = new ActionSequence();
		this.edges = new ArrayList<>();
	}
	
	/**
	 * Use this function to empty the action sequence associated with this node
	 */
	public void clearSequence() {
		this.sequence=new ActionSequence();
	}

	/**
	 * Use this function to remove the edges associated with this node
	 */
	public void clearEdges() {
		this.edges.clear();
	}
	
	/**
	 * Use this function to connect another node to this node via an edge (player choice)
	 * @param edge The edge (player choice) that connects this node to the child node
	 */
	public Node add(Edge edge) {
		edges.add(edge);
		return this;
	}
	/**
	 * Use this function to add a Camelot action to the sequence of actions that is executed when visiting this node.
	 * @param action The action to add to the end of the sequence.
	 * @return Returns this node's action sequence
	 */
	public ActionSequence add(IAction action) {
		sequence.add(action);
		return sequence;
	}
	/**
	 * Use this function to append an action sequence to the sequence of actions that is executed when visiting this node.
	 * @param other The sequence to append to the end of this node's action sequence.
	 * @return Returns this node's action sequence.
	 */
	public ActionSequence add(ActionSequence other) {
		sequence.add(other);
		return sequence;
	}

	Node getNextNode(Edge _edge) {
		for(var edge : edges) {
			if(edge.equals(_edge)) {
				return edge.getNode();
			}
		}
		return null;
	}
	
	List<Edge> getOutgoingEdges() {
		return edges;
	}

	public String toString() {
		return name;
	}
	
	ActionSequence getSequence() {
		return sequence;
	}
	
}
