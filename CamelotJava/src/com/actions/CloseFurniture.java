package com.actions;

import com.entities.*;
import com.entities.Characters;

/**
 * Character walks to a furniture and closes it. 
 * This action includes sound effects depending on the furniture.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.entities.Furniture
 * @see com.actions.OpenFurniture
 */
public class CloseFurniture implements IAction{
	Characters character;
	Furniture other;
	/**
	 * The furniture must be in the same place as the character
	 * @param character The character that closes the furniture
	 * @param other The furniture that will be closed
	 */
	public CloseFurniture(Characters character, Furniture other) {
		this.character=character;
		this.other=other;
	}

	/**
	 * @return CloseFurniture
	 */
	@Override
	public String getName() {
		return "CloseFurniture";
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
