package com.actions;

import com.entities.Characters;

/**
 * A character dies where they're standing.
 * @author Alireza Shirvani
 * com.entities.Character
 * com.actions.Revive
 */
public class Die implements IAction{
	Characters character;
	
	/**
	 * 
	 * @param character The character that will die.
	 */
	public Die(Characters character) {
		this.character = character;
	}

	/**
	 * @return Die
	 */
	@Override
	public String getName() {
		return "Die";
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
