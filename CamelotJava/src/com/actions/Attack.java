package com.actions;

import com.entities.Characters;
/**
 * A character attacks another character using the item in their right hand. 
 * If the attack hits, the victim bleeds, otherwise, they dodge the attack. 
 * This action includes sound effects.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.actions.Bash
 */
public class Attack implements IAction{
	Characters character, other;
	boolean dodge;
	/**
	 * @param character The character to attack
	 * @param other The character being attacked
	 */
	public Attack(Characters character, Characters other) {
		this(character, other, false);
	}
	/**
	 * 
	 * @param character The character to attack
	 * @param other The character being attacked
	 * @param dodge set to true if the victim dodges the attack
	 */
	public Attack(Characters character, Characters other, boolean dodge) {
		this.character=character;
		this.other=other;
		this.dodge = dodge;
	}

	/**
	 * @return Attack
	 */
	@Override
	public String getName() {
		return "Attack";
	}
	/**
	 * The experience manager waits for the completion of this action
	 * @return true
	 */
	@Override
	public boolean getShouldWait() {
		return true;
	}
	
	@Override
	public String toString() {
			return String.format("%s(%s, %s, %s)", 
					getName(), 
					character.getName(), 
					other.getName(), 
					dodge?"false":"true" );
	}

}
