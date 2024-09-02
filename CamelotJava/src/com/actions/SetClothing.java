package com.actions;

import com.entities.Characters;
import com.enums.Clothing;

/**
 * Changes the outfit of a character. If the character does not exist, use CreateCharacterSequence to set their outfit instead.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.enums.Clothing
 * @see com.sequences.CreateCharacterSequence
 */
public class SetClothing implements IAction {
	/**
	 * The experience manager does not wait for the completion of this action
	 * @return false
	 */
	@Override
	public boolean getShouldWait() {
		return false;
	}
	
	/**
	 * @return SetClothing
	 */
	@Override
	public String getName() {
		return "SetClothing";
	}
	
	private Characters character;
	/**
	 * Changes the outfit of a character to the outfit that was set when creating that character.
	 * If no outfit was set, the default outfit is Peasant.
	 * @param character The outfit of this character will change to their original outfit
	 */
	public SetClothing(Characters character) {
		this.character=character;
		this.clothing = character.getClothing();
	}
	private Clothing clothing;
	/**
	 * Changes the outfit of a character to another outfit
	 * @param character The outfit of this character will change
	 * @param clothing The new outfit of the character
	 */
	public SetClothing(Characters character, Clothing clothing) {
		this.character=character;
		this.clothing=clothing;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s(%s, %s)", getName(), character.getName(), clothing.toString());
	}



}
