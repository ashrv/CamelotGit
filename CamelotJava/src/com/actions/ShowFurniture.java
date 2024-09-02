package com.actions;

import com.entities.*;
/**
 * Makes a previously hidden furniture to appear again.
 * @author Alireza Shirvani
 * @see com.entities.Furniture
 * @see com.actions.HideFurniture
 */
public class ShowFurniture implements IAction{
	Furniture other;
	/**
	 * 
	 * @param other The previously hidden furniture to show
	 */
	public ShowFurniture(Furniture other) {
		this.other=other;
	}

	/**
	 * @return ShowFurniture
	 */
	@Override
	public String getName() {
		return "ShowFurniture";
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
			return String.format("%s(%s)", 
					getName(),
					other.getName());
	}

}
