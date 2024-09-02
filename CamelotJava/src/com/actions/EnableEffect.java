package com.actions;

import com.entities.IInteract;
import com.enums.Effects;
/**
 * Creates an effect on an entity which remains until disabled. 
 * The enabled effect is attached to the entity. Therefore, it is moved or becomes hidden if the entity moves or becomes hidden.
 * @author Alireza Shirvani
 * @see com.entities.IInteract
 * @see com.enums.Effects
 * @see <a href="http://cs.uky.edu/~sgware/projects/camelot/v1-2/effects.html">Visual Effects</a>
 * @see com.actions.CreateEffect
 * @see com.actions.DisableEffect
 */
public class EnableEffect implements IAction{
	IInteract interactable;
	Effects effect;
	/**
	 * The default effect is the diamond effect
	 * @param interactable The character, item, or furniture
	 */
	public EnableEffect(IInteract interactable) {
		this(interactable, Effects.Diamond);
	}
	/**
	 * 
	 * @param interactable The character, item, or furniture
	 * @param effect The effect that will appear above the interactable
	 */
	public EnableEffect(IInteract interactable, Effects effect) {
		this.interactable = interactable;
		this.effect = effect;
	}

	/**
	 * @return EnableEffect
	 */
	@Override
	public String getName() {
		return "EnableEffect";
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
					interactable.getName(),
					effect.toString());
	}

}
