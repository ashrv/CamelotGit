package com.actions.utility;

import com.actions.IAction;

public class ShowCredits implements IAction{

	/**
	 * @return Take
	 */
	@Override
	public String getName() {
		return "ShowCredits";
	}
	/**
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
