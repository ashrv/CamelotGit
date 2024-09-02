package com.entities;

import com.enums.PlaceTypes;
/**
 * This class represents a place.
 * A place is a creatable (ICreate).
 * Instantiating an object of type Place does NOT create the place in Camelot.
 * To do that, you must use CreateAll.
 * @author Alireza Shirvani
 * @see com.entities.ICreate
 * @see com.entities.IInteract
 * @see com.enums.PlaceTypes
 * @see com.sequences.CreateAll
 */
public class Place implements ICreate<PlaceTypes> {
	private String name;
	public String getName() {
		return name;
	}

	private PlaceTypes template;
	/**
	 * 
	 * @return The type of this place
	 */
	public PlaceTypes getTemplate() {
		return template;
	}

	/**
	 * 
	 * @param name The name of the place
	 * @param template The type of the place
	 */
	public Place(String name, PlaceTypes template) {
		this.name = name.toString();
		this.template = template;
	}
}
