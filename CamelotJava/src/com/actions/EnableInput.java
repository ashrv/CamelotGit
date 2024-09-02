package com.actions;

/**
 * Enables mouse and keybord input for the character that is set to the focus of the camera by SetCameraFocus. 
 * Regardless of how many times EnableInput was called in succession, if the player controls are enabled, 
 * it is only necessary to call DisableInput once to disable them.
 * Pressing the escape button disables the input and pressing it again enables it.
 * Certain actions including HideList, HideCredits, HideNarration, HideList, and HideDialog also enable the input since they are normally called after a corresponding Show action, e.g. ShowMenu, and those actions disable the input.
 * @author Alireza Shirvani
 * @see com.actions.DisableInput
 * @see com.actions.SetCameraFocus
*/
public class EnableInput implements IAction {

	/**
	 * @return EnableInput
	 */
	@Override
	public String getName() {
		return "EnableInput";
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
