package com.actions;

/**
 * Closes the credits window.
 * Use the CreditsSequence to show the credits window.
 * Use the CloseCreditsChoice to know when the player wants to close the credits window.
 * @author Alireza Shirvani
 * @see com.sequences.CreditsSequence
 * @see com.playerInput.CloseCreditsChoice
 */
public class HideCredits implements IAction{

	/**
	 * @return HideCredits
	 */
	@Override
	public String getName() {
		return "HideCredits";
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
			return String.format("%s()", 
					getName());
	}

}
