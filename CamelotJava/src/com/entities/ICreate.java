package com.entities;

/**
 * This class represents a Camelot component that can be created, e.g. Character, Item, Place.
 * A class implementing ICreate has a few templates of type T, e.g. Items, Places, BodyTypes.
 * You can create many instances of each template in Camelot with different names, e.g. City1, City2, etc.
 * @author alireza
 *
 * @param <T> The type of the template for the child class
 */
public interface ICreate<T> {
	/**
	 * 
	 * @return Each creatable must have a unique name.
	 */
	public String getName();
	/**
	 * 
	 * @return Each creatable is an instance of a template of type T.
	 */
	public T getTemplate();
}
