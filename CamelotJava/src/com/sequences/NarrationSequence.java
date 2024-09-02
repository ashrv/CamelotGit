package com.sequences;

import com.actions.utility.SetNarration;
import com.actions.utility.ShowNarration;
/**
 * Use this class to show narration to the player. 
 * The player can close the narration window by pressing the X button at the top right.
 * Use the CloseNarrationChoice to capture this choice.
 * Use HideNarration to close the narration window.
 * @author Alireza Shirvani
 * @see com.actions.HideNarration
 * @see com.playerInput.CloseNarrationChoice
 */
public class NarrationSequence extends ActionSequence{
	public NarrationSequence(String text) {
		add(new SetNarration(text));
		add(new ShowNarration());
		
	}
}
