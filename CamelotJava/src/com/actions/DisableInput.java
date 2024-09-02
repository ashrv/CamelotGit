package com.actions;

/**
 * Disables mouse and keyboard controls. Disabling the input in Camelot is managed as an integer. 
 * It means that each time DisableInput succeeds, it disables the input once, 
 * and EnableInput must called as many times as DisableInput was called to actually enable the player input.
 * Pressing the escape button disables the input and pressing it again enables it.
 * Certain actions including ShowList, ShowCredits, ShowNarration, ShowList, and ShowDialog also enable the input since they are normally followed by a corresponding Show action, e.g. HideDialog, and those actions disable the input.
 * @author Alireza Shirvani
 * @see com.actions.EnableInput
*/
public class DisableInput implements IAction {
	/**
	 * @return DisableInput
	 */
	@Override
	public String getName() {
		return "DisableInput";
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
