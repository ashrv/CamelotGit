package com.actions;

import com.entities.Characters;
import com.entities.Furniture;

/**
 * Character walks to, opens, and exits through a door. 
 * If the third parameter is set to true, the screen fades out as the character is exiting through the door. 
 * The door closes on its own. This action includes sound effects depending on the door.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.entities.Furniture
 * @see com.actions.Enter
*/
public class Exit implements IAction{
	Characters character;
	Furniture furniture;
	boolean fadeOut;
	
	/**
	 * @param character The character that will leave through a door
	 * @param furniture The door that Character will leave through
	 * @param fadeOut Set true if you want to screen to fade out after Character leaves through the door
	 */
	public Exit(Characters character, Furniture furniture, boolean fadeOut) {
		this.character=character;
		this.furniture=furniture;
		this.fadeOut=fadeOut;
	}
	
	/**
	 * @return Exit
	 */
	@Override
	public String getName() {
		return "Exit";
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
		return String.format("%s(%s, %s, %s)", getName(), character.getName(), furniture.getName(), fadeOut);
	}

}
