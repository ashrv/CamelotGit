package com.actions;
/**
 * Closes the narration window.
 * Use the NarrationSequence to show the narration window. 
 * Use the CloseNarrationChoice to know when the player wants to close the narration.
 * @author Alireza Shirvani
 * com.sequences.NarrationSequence
 * com.playerInput.CloseNarrationChoice
 */
public class HideNarration implements IAction{

	/**
	 * @return HideNarration
	 */
	@Override
	public String getName() {
		return "HideNarration";
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
