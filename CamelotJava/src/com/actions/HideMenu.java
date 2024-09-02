package com.actions;

/**
 * To start Camelot for the player, you must first use ShowMenu. This changes the screen from the loading screen to the main menu.
 * When the player clicks on Start in the main menu, Camelot sends the message: "input Selected Start".
 * Create an instance of SelectionChoice to wait for this message.
 * The experience manager waits for the success of this action.
 * @author Alireza Shirvani
 * @see com.actions.ShowMenu
 * @see com.playerInput.MenuChoice
 */
public class HideMenu implements IAction {
	/**
	 * @return "HideMenu"
	 */
	@Override
	public String getName() {
		return "HideMenu";
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
