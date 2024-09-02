package com.actions;

import com.entities.*;
import com.entities.Characters;
/**
 * Character draws an item and holds it with their right hand. If an item with the provided name does not exist, the action fails with an error. 
 * This action includes sound effects.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.entities.Item
 * @see com.actions.Sheathe
 * @see com.actions.Unpocket
 */
public class Draw implements IAction{
	Characters character;
	Item item;
	/**
	 * 
	 * @param character The character that draws the item
	 * @param item The item that will be drawn
	 */
	public Draw(Characters character, Item item) {
		this.character=character;
		this.item=item;
	}
	/**
	 * @return Draw
	 */
	@Override
	public String getName() {
		return "Draw";
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
