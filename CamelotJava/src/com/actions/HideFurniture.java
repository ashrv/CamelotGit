package com.actions;

import com.entities.*;
/**
 * Hides a piece of furniture.
 * @author Alireza Shirvani
 * com.entities.Furniture
 * com.actions.ShowFurniture
 */
public class HideFurniture implements IAction{
	Furniture other;
	/**
	 * 
	 * @param other The furniture to hide
	 */
	public HideFurniture(Furniture other) {
		this.other=other;
	}

	/**
	 * @return HideFurniture
	 */
	@Override
	public String getName() {
		return "HideFurniture";
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
