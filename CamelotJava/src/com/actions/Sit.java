package com.actions;

import com.entities.*;
import com.entities.Characters;
/**
 * A character sits down on a piece of furniture.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.entities.Furniture
 * @see com.actions.Sleep
 */
public class Sit implements IAction{
	Characters character;
	Furniture other;
	/**
	 * 
	 * @param character The character to sit down.
	 * @param other The furniture to sit down on.
	 */
	public Sit(Characters character, Furniture other) {
		this.character=character;
		this.other=other;
	}

	/**
	 * @return Sit
	 */
	@Override
	public String getName() {
		return "Sit";
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
