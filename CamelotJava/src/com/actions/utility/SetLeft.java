package com.actions.utility;

import com.actions.IAction;
import com.entities.Characters;

public class SetLeft implements IAction{
	Characters character;
	
	/**
	 * 
	 * @param character The character shown on the left
	 */
	public SetLeft(Characters character) {
		this.character=character;
	}
	
	/**
	 * @return SetLeft
	 */
	@Override
	public String getName() {
		return "SetLeft";
	}

	/**
	 * @return false
	 */
	@Override
	public boolean getShouldWait() {
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%s)", getName(), character.getName());
	}

}
