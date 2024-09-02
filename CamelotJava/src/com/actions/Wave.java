package com.actions;

import com.entities.Characters;
/**
 * A character waves their hand in the air where they are standing or sitting.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.actions.Laugh
 * @see com.actions.Clap
 */
public class Wave implements IAction{
	Characters character;
	/**
	 * 
	 * @param character The character that waves their hand for a few seconds.
	 */
	public Wave(Characters character) {
		this.character=character;
	}

	/**
	 * @return Wave
	 */
	@Override
	public String getName() {
		return "Wave";
	}
	
	/**
	 * The experience manager does not wait for the completion of this action
	 * @return false
	 */
	@Override
	public boolean getShouldWait() {
		return false;
	}
	
	@Override
	public String toString() {
			return String.format("%s(%s)", 
					getName(), 
					character.getName());
	}

}
