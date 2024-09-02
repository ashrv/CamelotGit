package com.playerInput;

/**
 * This class implements IPlayerChoice to represent when the player presses x at the top right of the list window to close it
 * @author Alireza Shirvani
 * @see com.playerInput.IPlayerChoice
 */
public class CloseListChoice implements IPlayerChoice{

	@Override
	public String getInputMsg() {
		return String.format("input Close List");
	}

}
