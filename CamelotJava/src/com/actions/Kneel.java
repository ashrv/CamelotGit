package com.actions;

import com.entities.Characters;
/**
 * A character kneels down where they are standing.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 */
public class Kneel implements IAction{
	Characters character;
	/**
	 * 
	 * @param character The character that will kneel.
	 */
	public Kneel(Characters character) {
		this.character = character;
	}

	/**
	 * @return Kneel
	 */
	@Override
	public String getName() {
		return "Kneel";
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
			return String.format("%s(%s)", 
					getName(), 
					character.getName() );
	}

}
