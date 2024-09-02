package com.actions.utility;

import com.actions.IAction;
import com.playerInput.PlayerInteraction;

/**
 * The story graph automatically creates instances of this class. This action corresponds to Camelot's EnableIcon. 
 * It is used to enable player choices based on the player edges of the graph.
 * The experience manager does not wait for the success of this action.
 * @author Alireza Shirvani
 * @see com.playerInput.PlayerInteraction
 */
public class EnableIcon implements IAction{
	/**
	 * @return EnableIcon
	 */
	@Override
	public String getName() {
		return "EnableIcon";
	}
	/**
	 * @return false
	 */
	@Override
	public boolean getShouldWait() {
		return false;
	}
	
	private PlayerInteraction choice;
	/**
	 * @param choice The player choice that will be enabled
	 */
	public EnableIcon(PlayerInteraction choice) {
		this.choice=choice;
	}
	
	@Override
	public String toString() {
			return String.format("%s(%s, %s, %s, %s, %s)", 
					getName(),
					choice.action, 
					choice.icon, 
					choice.target.getName(),
					choice.description, 
					choice.isDefault?true:false);
	}

}
