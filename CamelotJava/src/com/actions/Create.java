package com.actions;

import com.entities.ICreate;

/**
 * Use This action to create a place or item. 
 * To create a character, use the CreateCharacterSequence instead.
 * To create all places and items at once, use CreateAll instead.
 * @author Alireza Shirvani
 * @param <T> T is the type of the Thing that you want to create. Supply T with types, Character, Place, or Item.
 * @see com.entities.ICreate
 * @see com.entities.Place
 * @see com.entities.Item
 * @see com.sequences.CreateCharacterSequence
 * @see com.sequences.CreateAll
 */
public class Create<T extends ICreate<?>> implements IAction {
	/**
	 * The instance of the Thing that will be created
	 */
	T toCreate;
	
	/**
	 * The experience manager waits for the completion of this action
	 * @return true
	 */
	@Override
	public boolean getShouldWait() {
		return true;
	}
	
	/**
	 * @return CreateCharacter, CreateItem, or CreatePlace
	 */
	@Override
	public String getName() {
		return "Create"+toCreate.getClass().getSimpleName();
	}
	
	/**
	 * @param t The instance of the ICreate that must be created
	 */
	public Create(T t) {
		this.toCreate=t;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%s, %s)",getName(), toCreate.getName(), toCreate.getTemplate());
	}



}
