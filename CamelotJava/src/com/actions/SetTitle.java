package com.actions;

/**
 * Sets the title of the story shown on the main menu.
 * @author Alireza Shirvani
 * @see com.actions.ShowMenu
 */
public class SetTitle implements IAction{
	String title;
	/**
	 * 
	 * @param title The title of the story
	 */
	public SetTitle(String title) {
		this.title = title;
	}

	/**
	 * @return SetTitle
	 */
	@Override
	public String getName() {
		return "SetTitle";
	}
	/**
	 * The experience manager does not wait for the completion of this action
	 * @return false
	 */
	@Override
	public boolean getShouldWait() {
		return false;
	}
	
	@Override
	public String toString() {
			return String.format("%s(%s)", 
					getName(), 
					title);
	}

}
