package com.actions;

import com.entities.Characters;
/**
 * Changes the expression and gesture of a character.
 * @author Alireza Shirvani
 * @see com.entities.Characters
 */
public class SetExpression implements IAction{
	Characters character;
	public enum Expression{ Neutral, Happy, Sad, Angry, Disgusted, Scared, Surprised, Asleep }
	Expression expression;
	/**
	 * Use this constructor to reset a character's expression to neutral.
	 * @param character The character that will start emoting.
	 */
	public SetExpression(Characters character) {
		this(character, Expression.Neutral);
	}

	/**
	 * 
	 * @param character The character that will start emoting.
	 * @param expression The new expression of the character.
	 */
	public SetExpression(Characters character, Expression expression) {
		this.character = character;
		this.expression = expression;
	}

	/**
	 * @return SetExpression
	 */
	@Override
	public String getName() {
		return "SetExpression";
	}
	
	/**
	 * The experience manager does not wait for the completion of this action
	 * @return false
	 */
	@Override
	public boolean getShouldWait() {
		return false;
	}
	
	@Override
	public String toString() {
			return String.format("%s(%s, %s)", 
					getName(), 
					character.getName(),
					expression.toString());
	}

}
