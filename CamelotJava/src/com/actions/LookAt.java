package com.actions;

import com.entities.Characters;
import com.entities.IInteract;
/**
 * A character will turn their head to keep looking at another character, item, or furniture.
 * @author Alireza Shirvani
 * @see com.entities.IInteract
 * @see com.entities.Characters
 * @see com.actions.Face
 */
public class LookAt implements IAction{
	Characters character;
	IInteract other;
	/**
	 * Do not specify a target to make the character stop looking at an interactable.
	 * @param character The character that will stop looking at something.
	 */
	public LookAt(Characters character) {
		this.character=character;
	}
	/**
	 * 
	 * @param character The character will start looking at another interactable.
	 * @param other The interactable that the character will keep looking at.
	 */
	public LookAt(Characters character, IInteract other) {
		this.character=character;
		this.other= other;
	}

	/**
	 * @return LookAt
	 */
	@Override
	public String getName() {
		return "LookAt";
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
		if(other==null)
			return String.format("%s(%s)", 
					getName(), 
					character.getName());
		else
			return String.format("%s(%s, %s)", 
					getName(), 
					character.getName(),
					other.getName());
	}

}
