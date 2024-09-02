package com.entities;

import com.enums.ItemTypes;

/**
 * This class represents an item.
 * An item is an interactable (IInteract) and creatable (ICreate).
 * Instantiating an object of type Item does NOT create the item in Camelot.
 * To do that, you must use CreateAll.
 * @author Alireza Shirvani
 * @see com.entities.ICreate
 * @see com.entities.IInteract
 * @see com.enums.ItemTypes
 * @see com.sequences.CreateAll
 */
public class Item implements IInteract, ICreate<ItemTypes> {
	private String name;
	private ItemTypes template;
	
	@Override
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param name The name of the item
	 * @param template The type of the item
	 */
	public Item(String name, ItemTypes template) {
		this.name=name.toString();
		this.template=template;
	}

	/**
	 * 
	 * @return The type of this item
	 */
	@Override
	public ItemTypes getTemplate() {
		return template;
	}
}
