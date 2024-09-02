package com.storygraph;

import com.playerInput.IPlayerChoice;
/**
 * An object of this class represents an edge in your storygraph
 * @author Alireza Shirvani
 *
 */
public class Edge {
	/**
	 * The type of the player choice that this edge represents
	 */
	private IPlayerChoice choice;
	/**
	 * The node that this edge originates from
	 */
	private Node node;
	/**
	 * 
	 * @param choice An object of type IPlayerChoice that represents the type of the choice
	 * @param node The node that this edge originates from
	 */
	public Edge(IPlayerChoice choice, Node node) {
		this.choice = choice;
		this.node = node;
	}
	/**
	 * Get the choice represented by this edge
	 * @return
	 */
	public IPlayerChoice getChoice() {
		return choice;
	}
	/**
	 * Get the node that this edge originated from
	 * @return
	 */
	public Node getNode() {
		return node;
	}
	
}
