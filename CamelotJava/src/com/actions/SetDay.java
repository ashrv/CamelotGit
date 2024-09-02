package com.actions;
/**
 * Sets the time of the day to daytime.
 * @author Alireza Shirvani
 * @see com.actions.SetNight
 */
public class SetDay implements IAction{

	/**
	 * @return SetDay
	 */
	@Override
	public String getName() {
		return "SetDay";
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
