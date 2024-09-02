package com.playerInput;

/**
 * This class implements IPlayerChoice to represent when the player presses x at the top right of the credits window to close it
 * @author Alireza Shirvani
 * @see com.playerInput.IPlayerChoice
 */
public class CloseCreditsChoice implements IPlayerChoice{

	@Override
	public String getInputMsg() {
		return String.format("input Close Credits");
	}

}
