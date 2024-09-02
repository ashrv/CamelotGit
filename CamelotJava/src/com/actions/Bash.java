package com.actions;

import com.entities.*;
import com.entities.Characters;

/**
 * A character bashes the specified furniture with their right hand. 
 * This action includes sound effects.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.entities.Furniture
 * @see com.actions.Attack
 */
public class Bash implements IAction{
	Characters character;
	Furniture other;
	/**
	 * 
	 * @param character The character bashing a piece of furniture.
	 * @param other The piece of furniture being bashed
	 */
	public Bash(Characters character, Furniture other) {
		this.character=character;
		this.other=other;
	}

	/**
	 * @return Bash
	 */
	@Override
	public String getName() {
		return "Bash";
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
