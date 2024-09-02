package com.actions;
/**
 * Changes the time of day to night time.
 * @author Alireza Shirvani
 * @see com.actions.SetDay
 */
public class SetNight implements IAction{

	/**
	 * @return SetNight
	 */
	@Override
	public String getName() {
		return "SetNight";
	}
	
	/**
	 * The experience manager does not wait for the completion of this action
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
