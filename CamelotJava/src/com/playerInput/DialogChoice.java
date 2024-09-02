package com.playerInput;

/**
 * This class implements IPlayerChoice to represent the player selecting a dialog option
 * @author Alireza Shirvani
 * @see com.playerInput.PlayerInteraction
 */
public class DialogChoice implements IPlayerChoice{
	/**
	 * The text of the option that the player interacts with
	 */
	private String key;
	/**
	 * Constructor
	 * @param option The text of the option that the player interacts with
	 */
	public DialogChoice(String option) {
		this.key=option.replaceAll("[^A-Za-z]+", "");
	}
	
	@Override
	public String getInputMsg() {
		return String.format("input Selected %s", key);
	}
}
