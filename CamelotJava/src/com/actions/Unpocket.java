package com.actions;

import com.entities.*;
import com.entities.Characters;
/**
 * A character takes something out of their pocket and holds them in their left hand.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.entities.Item
 * @see com.actions.Pocket
 * @see com.actions.Draw
 */
public class Unpocket implements IAction{
	Characters character;
	Item item;
	/**
	 * 
	 * @param character The character that takes something out of their pocket.
	 * @param item The item being taken out and held.
	 */
	public Unpocket(Characters character, Item item) {
		this.character=character;
		this.item=item;
	}
	
	/**
	 * @return Unpocket
	 */
	@Override
	public String getName() {
		return "Unpocket";
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
