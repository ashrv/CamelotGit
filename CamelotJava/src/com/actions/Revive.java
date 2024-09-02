package com.actions;

import com.entities.Characters;
/**
 * A dead character comes back to life and stands up.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.actions.Die
 */
public class Revive implements IAction{
	Characters character;
	/**
	 * 
	 * @param character The character to rise back from the dead.
	 */
	public Revive(Characters character) {
		this.character = character;
	}

	/**
	 * @return Revive
	 */
	@Override
	public String getName() {
		return "Revive";
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
