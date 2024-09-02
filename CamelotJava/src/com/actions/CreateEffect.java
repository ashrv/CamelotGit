package com.actions;

import com.entities.IInteract;
import com.enums.Effects;
/**
 * Creates a temporary effect on an entity which disappears after a few seconds. 
 * Created effect is not attached to the entity. 
 * In other words, the effect remains at the spot it was created for its duration even if the entity moves or becomes hidden.
 * @author Alireza Shirvani
 * @see com.enums.Effects
 * @see com.entities.IInteract
 * @see <a href="http://cs.uky.edu/~sgware/projects/camelot/v1-2/effects.html">Visual effects</a>
 */
public class CreateEffect implements IAction{
	IInteract interactable;
	Effects effect;
	
	/**
	 * The default effect is the diamond effect.
	 * @param interactable The character, item, or place to create the effect above
	 */
	public CreateEffect(IInteract interactable) {
		this(interactable, Effects.Diamond);
	}
	/**
	 * 
	 * @param interactable The character, item, or place to create the effect above
	 * @param effect The effect to create above the interactable.
	 */
	public CreateEffect(IInteract interactable, Effects effect) {
		this.interactable = interactable;
		this.effect = effect;
	}

	/**
	 * @return CreateEffect
	 */
	@Override
	public String getName() {
		return "CreateEffect";
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
