package com.actions;

import com.entities.*;
import com.entities.Characters;
/**
 * A character puts the item they're holding in their left hand in their pocket.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.entities.Item
 * @see com.actions.Unpocket
 * @see com.actions.Sheathe
 */
public class Pocket implements IAction{
	Characters character;
	Item item;
	/**
	 * 
	 * @param character The character that puts something in their pocket.
	 * @param item The item in the left hand of the character.
	 */
	public Pocket(Characters character, Item item) {
		this.character=character;
		this.item=item;
	}
	
	/**
	 * @return Pocket
	 */
	@Override
	public String getName() {
		return "Pocket";
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
