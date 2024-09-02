package com.actions;

import com.entities.*;
import com.entities.Characters;
/**
 * Character turns to face another character, item, or furniture within the same place.
 * @author Alireza Shirvani
 * @see com.entities.IInteract
 * @see com.entities.Characters
 * @see com.actions.LookAt
 */
public class Face implements IAction{
	Characters character;
	IInteract other;
	/**
	 * 
	 * @param character The character that turns to face the interactable.
	 * @param other The interactable that the character will face.
	 */
	public Face(Characters character, IInteract other) {
		this.character=character;
		this.other=other;
	}

	/**
	 * @return Face
	 */
	@Override
	public String getName() {
		return "Face";
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
			return String.format("%s(%s, %s)", getName(), character.getName(), other.getName() );
	}

}
