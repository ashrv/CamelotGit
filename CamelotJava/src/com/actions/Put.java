package com.actions;

import com.entities.*;
import com.entities.Characters;
/**
 * Character extends their arm to put an item they're holding in their left hand. 
 * If no target is provided, the item disappears. 
 * Otherwise, the character first walks up to the target. 
 * If the target is a surface position or a furniture with at least one surface position, the item is placed on the surface. 
 * If the target is a character, the item will be placed in their left hand.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.entities.Item
 * @see com.entities.Furniture
 * @see com.actions.Putdown
 * @see com.actions.Take
 * @see <a href="http://cs.uky.edu/~sgware/projects/camelot/v1-2/places.html">Places and Positions</a>
 */
public class Put implements IAction{
	Characters character;
	Item item;
	String position;
	/**
	 * 
	 * @param character The character that puts something on the furniture.
	 * @param item The item to be put on the furniture.
	 * @param furniture The furniture to put the item on top of.
	 */
	public Put(Characters character, Item item, Furniture furniture) {
		this.character=character;
		this.item=item;
		this.position = furniture.getName();
	}
	
	/**
	 * 
	 * @param character The character that puts something on the furniture.
	 * @param item The item to be put on the furniture.
	 * @param furniture The furniture to put the item on top of.
	 * @param position The specific position on top of the furniture
	 */
	public Put(Characters character, Item item, Furniture furniture, String position) {
		this.character=character;
		this.item=item;
		this.position = furniture.getName()+"."+position;
	}
	
	/**
	 * @return Put
	 */
	@Override
	public String getName() {
		return "Put";
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
			return String.format("%s(%s, %s, %s)", getName(), character.getName(), item.getName(), position);
	}

}
