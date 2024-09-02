package com.actions;

import com.entities.Characters;
/**
 * The character dances. If two characters are specified, they dance together.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 */
public class Dance implements IAction{
	Characters character, other;

	/**
	 * 
	 * @param character The character that will dance.
	 */
	public Dance(Characters character) {
		this.character = character;
	}
	/**
	 * 
	 * @param character The character that will dance
	 * @param other The other character that will dance with the first character
	 */
	public Dance(Characters character, Characters other) {
		this.character = character;
		this.other = other;
	}

	/**
	 * @return Dance or DanceTogether
	 */
	@Override
	public String getName() {
		return other==null?"Dance":"DanceTogether";
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
		if(other==null)
			return String.format("%s(%s)", 
					getName(), 
					character.getName());
		else
			return String.format("%s(%s, %s)", 
					getName(), 
					character.getName(), 
					other.getName() );
	}

}
