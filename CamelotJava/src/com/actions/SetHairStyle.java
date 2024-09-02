package com.actions;

import com.entities.Characters;
import com.enums.HairStyle;

/**
 * Changes the hair style of a character. If the character does not exist, use CreateCharacterSequence to set their outfit instead.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.sequences.CreateCharacterSequence
 * @see com.actions.SetHairColor
 */
public class SetHairStyle implements IAction {
	/**
	 * The experience manager does not wait for the completion of this action
	 * @return false
	 */
	@Override
	public boolean getShouldWait() {
		return false;
	}
	
	/**
	 * @return SetHairStyle
	 */
	@Override
	public String getName() {
		return "SetHairStyle";
	}
	
	private Characters character;
	/**
	 * The hair is automatically set from character.getHairStyle.
	 * @param character The character to change their hair style.
	 */
	public SetHairStyle(Characters character) {
		this.character=character;
		this.style = character.getHairStyle();
	}
	private HairStyle style;
	/**
	 * The hair style is changed without changing character.hairStyle.
	 * @param character The character to change their hair style.
	 * @param style The new hair style.
	 */
	public SetHairStyle(Characters character, HairStyle style) {
		this.character=character;
		this.style=style;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s(%s, %s)", getName(), character.getName(), style.toString());
	}



}
