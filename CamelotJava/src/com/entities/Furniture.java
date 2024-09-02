package com.entities;

import com.enums.FurnitureTypes;

/**
 * This class represents a piece of furniture.
 * The furniture is an interactable (IInteract).
 * @author Alireza Shirvani
 * @see com.entities.IInteract
 */
public class Furniture implements IInteract {
	/**
	 * The instance of the place this furniture is located at
	 */
	private Place place;
	/**
	 * The type of the furniture
	 */
	private FurnitureTypes type;

	/**
	 * 
	 * @param place The instance of the place this furniture is located at
	 * @param type The type of the furniture
	 */
	public Furniture(Place place, FurnitureTypes type) {
		this.type = type;
		this.place = place;
	}

	@Override
	public String getName() {
		return place.getName() + "." + type;
	}
}
