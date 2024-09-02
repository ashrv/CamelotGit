package com.actions;

import com.entities.*;
import com.entities.Characters;

/**
 * Character walks to a target position.
 * If the target position is furniture, the character walks to its default position.
 * If the target position is another character, the character walks to their position and follows them if they are moving.
 * If the target position is a place, the character walks to its default position (mostly at the center of that place).
 * If the target position is in a different place than the character, the action fails.
 * If the target position is a character and they leave the place after this action is started, the action fails.
 * If the path is blocked and the character cannot reach the target, this action fails.
 * If the target position is furniture and its default position is occupied by another character, the character approaches the furniture but the action will fail.
 * If this action is interrupted by other actions, this action fails.
 * @author Alireza Shirvani
 * @see com.entities.IInteract
 * @see com.entities.Characters
 * @see <a href="http://cs.uky.edu/~sgware/projects/camelot/v1-2/places.html">Places and Positions</a>
 */
public class WalkTo implements IAction{
	Characters character;
	String position;
	/**
	 * 
	 * @param character The character that will talk to somewhere.
	 * @param other The target interactable that the character will talk to.
	 */
	public WalkTo(Characters character, IInteract other) {
		this.character=character;
		this.position = other.getName();
	}
	/**
	 * 
	 * @param character The character that will walk to somewhere.
	 * @param place The place where the target position is located at.
	 * @param position The specific position within a place.
	 */
	public WalkTo(Characters character, Place place, String position) {
		this.character=character;
		this.position=place.getName()+"."+position;
	}

	/**
	 * @return WalkTo
	 */
	@Override
	public String getName() {
		return "WalkTo";
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
					position);
	}

}
