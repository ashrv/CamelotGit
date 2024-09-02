package com.actions;

import com.entities.*;
import com.entities.Characters;
/**
 * A character bends down to put down an item on the ground. This is only an animation.
 * The item won't actually be put on the ground.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.entities.Item
 * @see com.actions.Pickup
 * @see com.actions.Put
 */
public class Putdown implements IAction{
	Characters character;
	Item item;
	/**
	 * 
	 * @param character The character that puts something on the ground.
	 * @param item The item to be put down on the ground.
	 */
	public Putdown(Characters character, Item item) {
		this.character=character;
		this.item=item;
	}
	
	/**
	 * @return Putdown
	 */
	@Override
	public String getName() {
		return "Putdown";
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
