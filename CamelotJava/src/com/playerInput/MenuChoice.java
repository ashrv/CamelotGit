package com.playerInput;

/**
 * This class implements IPlayerChoice to represent when the player presses the Start button on the main menu.
 * This must be the first choice the player makes in your story.
 * @author Alireza Shirvani
 * @see com.playerInput.IPlayerChoice
 */
public class MenuChoice implements IPlayerChoice{

	/**
	 * The main menu button that was pressed
	 */
	private Options key;
	/**
	 * An enum representing all the main menu buttons that the player can press
	 */
	public enum Options{Start, Resume, Credits, Quit}
	/**
	 * The constructor
	 * @param key The main menu button that was pressed
	 */
	public MenuChoice(Options key) {
		this.key=key;
	}
	
	@Override
	public String getInputMsg() {
		return String.format("input Selected %s", key.toString());
	}

}
