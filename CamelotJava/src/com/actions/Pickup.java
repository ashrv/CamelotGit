package com.actions;

import com.entities.*;
import com.entities.Characters;
/**
 * A character bends down to pick up an item from the ground.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.entities.Item
 * @see com.actions.Putdown
 * @see com.actions.Take
 */
public class Pickup implements IAction{
	Characters character;
	Item item;
	/**
	 * 
	 * @param character The character that picks the item from the ground.
	 * @param item The item that will be picked up from the ground.
	 */
	public Pickup(Characters character, Item item) {
		this.character=character;
		this.item=item;
	}
	
	/**
	 * @return Pickup
	 */
	@Override
	public String getName() {
		return "Pickup";
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
