package com.sequences;

import com.actions.utility.SetCredits;
import com.actions.utility.ShowCredits;
/**
 * Use this class to show the credits window.
 * The player can close the credits window by pressing the X button at the top right.
 * Use the CloseCreditsChoice to capture this choice.
 * Use HideCredits to hide the credits window.
 * @author Alireza Shirvani
 * @see com.actions.HideCredits
 * @see com.playerInput.CloseCreditsChoice
 */
public class CreditsSequence extends ActionSequence{
	/**
	 * 
	 * @param text A text including you and your group partner's names and perhaps, the course name.
	 */
	public CreditsSequence(String text) {
		add(new SetCredits(text));
		add(new ShowCredits());
		
	}
}
