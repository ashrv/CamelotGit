package com.actions;

import com.entities.Characters;
/**
 * Character casts a spell. 
 * If a target is specified, the caster faces the target first. 
 * There are two different animations for casting spell with or without a target. 
 * You can specify the projectile color if a target is specified.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 * @see com.actions.CreateEffect
 *
 */
public class Cast implements IAction{
	Characters character, other;
	public enum Spell{ blue, red, purple }
	Spell spell;
	/**
	 * 
	 * @param character The character casts a spell on themself.
	 */
	public Cast(Characters character) {
		this.character=character;
	}

	/**
	 * 
	 * @param character The character casting a spell
	 * @param other The target of the spell
	 */
	public Cast(Characters character, Characters other) {
		this(character, other, Spell.red);
	}

	/**
	 * 
	 * @param character The character casting a spell
	 * @param other The target of the spell
	 * @param spell The color of the spell
	 */
	public Cast(Characters character, Characters other, Spell spell) {
		this.character=character;
		this.other=other;
		this.spell = spell;
	}

	/**
	 * @return Cast
	 */
	@Override
	public String getName() {
		return "Cast";
	}
	/**
	 * 
	 * The experience manager waits for the completion of this action
	 * @return true
	 */
	@Override
	public boolean getShouldWait() {
		return true;
	}
	
	@Override
	public String toString() {
		if(other!=null)
			return String.format("%s(%s, %s, %s)", 
					getName(), 
					character.getName(), 
					other.getName(),
					spell.toString());
		else
			return String.format("%s(%s)", 
					getName(), 
					character.getName());
	}

}
