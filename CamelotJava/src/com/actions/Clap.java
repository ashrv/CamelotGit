package com.actions;

import com.entities.Characters;

/**
 * A character claps for a few seconds where they are standing or sitting.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.actions.Wave
 * @see com.actions.Laugh
 */
public class Clap implements IAction{
	Characters character;
	
	/**
	 * 
	 * @param character The character clapping
	 */
	public Clap(Characters character) {
		this.character=character;
	}

	/**
	 * @return Clap
	 */
	@Override
	public String getName() {
		return "Clap";
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
