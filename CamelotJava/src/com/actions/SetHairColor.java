package com.actions;

import com.entities.Characters;
import com.enums.Colors;

/**
 * Changes the hair color of a character. If the character does not exist, use CreateCharacterSequence to set their outfit instead.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.sequences.CreateCharacterSequence
 * @see com.actions.SetHairStyle
 */
public class SetHairColor implements IAction {
	/**
	 * The experience manager does not wait for the completion of this action
	 * @return false
	 */
	@Override
	public boolean getShouldWait() {
		return false;
	}
	
	/**
	 * @return SetHairColor
	 */
	@Override
	public String getName() {
		return "SetHairColor";
	}
	
	private Characters character;
	/**
	 * The hair is automatically set from character.getHairColor.
	 * @param character The character to change their hair color.
	 */
	public SetHairColor(Characters character) {
		this.character=character;
		this.color = character.getHairColor();
	}
	private Colors color;
	/**
	 * The hair color is changed without changing character.hairColor.
	 * @param character The character to change their hair color
	 * @param color The new hair color.
	 */
	public SetHairColor(Characters character, Colors color) {
		this.character=character;
		this.color=color;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s(%s, %s)", getName(), character.getName(), color.toString());
	}



}
