package com.actions;

import com.entities.*;
import com.entities.Characters;
/**
 * A character lies down on a piece of furniture.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.entities.Furniture
 * @see com.actions.Sit
 */
public class Sleep implements IAction{
	Characters character;
	Furniture other;
	/**
	 * 
	 * @param character The character that will lie down.
	 * @param other The furniture that the character will lie down on.
	 */
	public Sleep(Characters character, Furniture other) {
		this.character=character;
		this.other=other;
	}

	/**
	 * @return Sleep
	 */
	@Override
	public String getName() {
		return "Sleep";
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
			return String.format("%s(%s, %s)", 
					getName(), 
					character.getName(), 
					other.getName());
	}

}
