package com.actions;

import com.entities.*;
import com.entities.Characters;

/**
 * Character sheathes the item they're holding in their right hand. 
 * If the character is holding the item or an item with the provided name does not exist, the action fails. 
 * This action includes sound effects.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.entities.Item
 * @see com.actions.Draw
 * @see com.actions.Pocket
 */
public class Sheathe implements IAction{
	Characters character;
	Item item;
	/**
	 * 
	 * @param character The character to sheathe an item.
	 * @param item The item to be sheathed.
	 */
	public Sheathe(Characters character, Item item) {
		this.character=character;
		this.item=item;
	}
	
	/**
	 * @return Sheathe
	 */
	@Override
	public String getName() {
		return "Sheathe";
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
			return String.format("%s(%s, %s)", getName(), character.getName(), item.getName());
	}

}
