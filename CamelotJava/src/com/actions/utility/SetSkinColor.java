package com.actions.utility;

import com.actions.IAction;
import com.entities.Characters;

/**
 * Changes the outfit of a character. If the character does not exist, use CharacterCreation to set their outfit instead.
 *  * The experience manager does not wait for the success of this action.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.sequences.CreateCharacterSequence
 */
public class SetSkinColor implements IAction {
	/**
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
		return "SetSkinColor";
	}
	
	private Characters character;
	/**
	 * Changes the outfit of a character to the outfit that was set when creating that character.
	 * If no outfit was set, the default outfit is Peasant.
	 * @param character The outfit of this character will change to their original outfit
	 */
	public SetSkinColor(Characters character) {
		this.character=character;
		this.skin = character.getSkinColor();
	}
	private int skin;

	@Override
	public String toString() {
		return String.format("%s(%s, %d)", getName(), character.getName(), skin);
	}



}
