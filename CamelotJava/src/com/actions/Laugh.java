package com.actions;

import com.entities.Characters;
/**
 * A character laughs where they are standing or sitting.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.actions.Clap
 * @see com.actions.Wave
 */
public class Laugh implements IAction{
	Characters character;
	/**
	 * 
	 * @param character The character that will laugh.
	 */
	public Laugh(Characters character) {
		this.character=character;
	}

	/**
	 * @return Laugh
	 */
	@Override
	public String getName() {
		return "Laugh";
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
