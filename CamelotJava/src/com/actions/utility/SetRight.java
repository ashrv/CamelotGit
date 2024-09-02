package com.actions.utility;

import com.actions.IAction;
import com.entities.Characters;

public class SetRight implements IAction{
	Characters character;
	
	/**
	 * 
	 * @param character The character shown on the right side of the dialog
	 */
	public SetRight(Characters character) {
		this.character=character;
	}
	
	/**
	 * @return SetRight
	 */
	@Override
	public String getName() {
		return "SetRight";
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
