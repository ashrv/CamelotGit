package com.actions.utility;

import com.actions.IAction;

public class SetCredits implements IAction{
	String credits;
	
	/**
	 * 
	 * @param dialog The credits to show
	 */
	public SetCredits(String dialog) {
		this.credits=dialog;
	}
	
	/**
	 * @return SetCredits
	 */
	@Override
	public String getName() {
		return "SetCredits";
	}

	/**
	 * @return false
	 */
	@Override
	public boolean getShouldWait() {
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%s)", getName(), credits);
	}

}
