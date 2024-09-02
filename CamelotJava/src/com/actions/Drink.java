package com.actions;

import com.entities.Characters;
/**
 * Character drinks from the items they're holding in their left hand.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 */
public class Drink implements IAction{
	Characters character;
	/**
	 * 
	 * @param character The character that will drink from the item in their left hand.
	 */
	public Drink(Characters character) {
		this.character=character;
	}

	/**
	 * @return Drink
	 */
	@Override
	public String getName() {
		return "Drink";
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
			return String.format("%s(%s)", 
					getName(), 
					character.getName());
	}

}
