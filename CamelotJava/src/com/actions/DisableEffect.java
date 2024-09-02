package com.actions;

import com.entities.IInteract;
import com.enums.Effects;
/**
 * Hides an effect that was previously enabled on a character, item, or furniture.
 * @author Alireza Shirvani
 * @see com.entities.IInteract
 * @see com.enums.Effects
 * @see com.actions.EnableEffect
 * @see <a href="http://cs.uky.edu/~sgware/projects/camelot/v1-2/effects.html">Visual Effects</a>
 */
public class DisableEffect implements IAction{
	IInteract interactable;
	Effects effect;
	
	/**
	 * Disables all effects previously enabled on the interactable
	 * @param interactable The interactable with the effects
	 */
	public DisableEffect(IInteract interactable) {
		this.interactable = interactable;
	}
	/**
	 * 
	 * @param interactable The interactable with the effect 
	 * @param effect The specific effect to disable
	 */
	public DisableEffect(IInteract interactable, Effects effect) {
		this.interactable = interactable;
		this.effect = effect;
	}

	/**
	 * @return DisableEffect
	 */
	@Override
	public String getName() {
		return "DisableEffect";
	}
	
	/**
	 * 
	 * The experience manager does not wait for the completion of this action
	 * @return false
	 */
	@Override
	public boolean getShouldWait() {
		return false;
	}
	
	@Override
	public String toString() {
		if(effect==null)
			return String.format("%s(%s)", 
					getName(), 
					interactable.getName());
		else
			return String.format("%s(%s, %s)", 
					getName(), 
					interactable.getName(),
					effect.toString());
	}

}
