package com.actions;

/**
 * The screen fades in from black.
 * @author Alireza Shirvani
 * @see com.actions.FadeOut
 */
public class FadeIn implements IAction {
	/**
	 * @return FadeIn
	 */
	@Override
	public String getName() {
		return "FadeIn";
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
		return String.format("%s()", getName());
	}

}
