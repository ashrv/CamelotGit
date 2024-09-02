package com.entities;

/**
 * This class represents the interactable entities in Camelot. Meaning that the player can right click on these entities to make a choice.
 * @author Alireza Shirvani
 *
 */
public interface IInteract{
	/**
	 * For interactables that are also creatable, 
	 * this function should return the same name.
	 * @return An interactable must have a unique name.
	 */
	public String getName();
}
