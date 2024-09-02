package com.actions;
/**
 * The screen fades out to black.
 * @author Alireza Shirvani
 * @see com.actions.FadeIn
 */
public class FadeOut implements IAction{

	/**
	 * @return FadeOut
	 */
	@Override
	public String getName() {
		return "FadeOut";
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
			return String.format("%s()", 
					getName());
	}

}
