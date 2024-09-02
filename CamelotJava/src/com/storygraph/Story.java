package com.storygraph;

/**
 * This class represents a story that we want to tell using Camelot.
 * 
 * @author Alireza Shirvani
 *
 */
public class Story {
	/**
	 * Call this function in your public static void main to start the story
	 */
	public final void Run(Graph graph) {
		try {
			System.out.println("Start");
			while(graph.traverse()!=null);
			System.out.println("End");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
