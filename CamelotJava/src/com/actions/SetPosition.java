package com.actions;

import com.entities.ICreate;

import com.entities.*;
import com.entities.Characters;

/**
 * Create an instance of this class whenever you want to change the position of a character or item.
 * The experience manager waits for the success of this action.
 * @author Alireza Shirvani
 *@see com.entities.ICreate
 *@see com.entities.Characters
 *@see com.entities.Item
 *@see com.entities.Furniture
 *@see com.entities.Place
 *@see <a href="http://cs.uky.edu/~sgware/projects/camelot/v1-2/places.html">Places and Positions</a>
*/
public class SetPosition implements IAction {

	private Characters character;
	private Item item;
	private ICreate<?> thing;
	private String position;
	
	/**
	 * Make a character disappear; it will still exist.
	 * @param character The character that will disappear
	 */
	public SetPosition(Characters character) {
		this.character=character;
	}
	/**
	 * Make an item disappear; it will still exist.
	 * @param item The item that will disappear
	 */
	public SetPosition(Item item) {
		this.item=item;
	}
	/**
	 * Move a character near a Thing
	 * @param character The character to move
	 * @param thing A place, item, or another character
	 * @see com.entities.ICreate
	 */
	public SetPosition(Characters character, ICreate<?> thing) {
		this(character);
		this.thing=thing;
	}
	/**
	 * Move a character to a specific position.
	 * @param character The character to move.
	 * @param place The place that holds the position.
	 * @param position The position or furniture name.
	 * @see <a href="http://cs.uky.edu/~sgware/projects/camelot/v1-2/places.html">Places and positions</a>
	 */
	public SetPosition(Characters character, Place place, String position) {
		this(character, place);
		this.position=place.getName()+"."+position;
	}
	/**
	 * Move a character in front of a piece of furniture.
	 * @param character The character to move.
	 * @param furniture The furniture to move the character to.
	 */
	public SetPosition(Characters character, Furniture furniture) {
		this.character = character;
		this.position=furniture.getName();
	}
	/**
	 * Place an item on a piece of furniture.
	 * @param item The item to place.
	 * @param furniture The furniture to place the item on top of.
	 */
	public SetPosition(Item item, Furniture furniture) {
		this.item = item;
		this.position=furniture.getName();
	}
	/**
	 * Place an item on a specific position on top of a piece of furniture.
	 * @param item The item to place.
	 * @param furniture The furniture to place the item on top of.
	 * @param position The position on top of the furniture
	 */
	public SetPosition(Item item, Furniture furniture, String position) {
		this.item = item;
		this.position=furniture.getName()+"."+position;
	}
	/**
	 * Move an item to a specific position.
	 * @param item The item to move
	 * @param place The place that holds the position
	 * @param position The position or furniture name.
	 * @see <a href="http://cs.uky.edu/~sgware/projects/camelot/v1-2/places.html">Places and Positions</a>
	 */
	public SetPosition(Item item, Place place, String position) {
		this(item, place);
		this.position=place.getName()+"."+position;
	}
	/**
	 * Move an item near a Thing
	 * @param item The item to move
	 * @param thing A place, item, or another character
	 * @see com.entities.ICreate
	 */
	public SetPosition(Item item, ICreate<?> thing) {
		this(item);
		this.thing=thing;
	}
	
	/**
	 * @return SetPosition
	 */
	@Override
	public String getName() {
		return "SetPosition";
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
		if(character!=null) {
			if(position!=null) {
				return String.format("%s(%s, %s)", getName(), character.getName(), position);
			}else if(thing!=null) {
				return String.format("%s(%s, %s)", getName(), character.getName(), thing.getName());
			}else {
				return String.format("%s(%s, null)", getName(), character.getName());
			}
		}else {
			if(position!=null) {
				return String.format("%s(%s, %s)", getName(), item.getName(), position);
			}else if(thing!=null) {
				return String.format("%s(%s, %s)", getName(), item.getName(), thing.getName());
			}else {
				return String.format("%s(%s, null)", getName(), item.getName());
			}
		}
		
	}

}
