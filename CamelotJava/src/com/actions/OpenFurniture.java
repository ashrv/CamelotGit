package com.actions;

import com.entities.*;
import com.entities.Characters;
/**
 * A character walks to a piece of furniture and opens it. 
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.entities.Furniture
 * @see com.actions.CloseFurniture
 */
public class OpenFurniture implements IAction{
	Characters character;
	Furniture other;
	/**
	 * 
	 * @param character The character that will open the furniture.
	 * @param other The furniture that the character will open.
	 */
	public OpenFurniture(Characters character, Furniture other) {
		this.character=character;
		this.other=other;
	}

	/**
	 * @return OpenFurniture
	 */
	@Override
	public String getName() {
		return "OpenFurniture";
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
