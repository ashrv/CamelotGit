package com.actions;

/**
 * Closes the list window. The list structure keeps track of a set of items 
 * that could be used to represent the contents of a furniture or the possessions of a character. 
 * Items can be added or removed from the list with an optional description which are displayed when the list is shown. 
 * Icons that are enabled for an item can be accessed by right clicking that item in the list.
 * Use the ListSequence to show the list window.
 * Use the CloseListChoice to know when the player wants to close the list.
 * @author Alireza Shirvani
 * @see com.sequences.ListSequence
 * @see com.playerInput.CloseListChoice
 */
public class HideList implements IAction {
	/**
	 * @return "HideList"
	 */
	@Override
	public String getName() {
		return "HideList";
	}
	/**
	 * The experience manager waits for the completion of this action
	 * @return true
	 */
	@Override
	public boolean getShouldWait() {
		return true;
	}

	@Override
	public String toString() {
		return String.format("%s()", getName());
	}

}
