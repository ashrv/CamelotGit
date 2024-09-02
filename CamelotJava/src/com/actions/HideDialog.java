package com.actions;
/**
 * Closes the dialog window.
 * Use the DialogSequence to show the dialog window.
 * Use a DialogChoice to hide the dialog when the player needs to.
 * @author Alireza Shirvani
 * @see com.sequences.DialogSequence
 * @see com.playerInput.DialogChoice
 */
public class HideDialog implements IAction{

	
	/**
	 * @return HideDialog
	 */
	@Override
	public String getName() {
		return "HideDialog";
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
		return String.format("%s()", getName() );
	}

}
