package com.actions;

import com.entities.*;
import com.entities.Characters;
/**
 * Character walks to and hands an item to another character with their left hand.
 * @author Alireza Shirvani
 * @see com.entities.Item
 * @see com.entities.Characters
 * @see com.actions.Take
 */
public class Give implements IAction{
	Characters character;
	Item item;
	Characters other;
	/**
	 * 
	 * @param character The character that will hand the item
	 * @param item The item being given
	 * @param other The character that takes the item
	 */
	public Give(Characters character, Item item, Characters other) {
		this.character =character;
		this.item = item;
		this.other=other;
	}
	/**
	 * @return Give
	 */
	@Override
	public String getName() {
		return "Give";
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
			return String.format("%s(%s, %s, %s)", getName(), character.getName(), item.getName(), other.getName());
	}

}
