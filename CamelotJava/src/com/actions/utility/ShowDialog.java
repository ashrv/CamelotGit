package com.actions.utility;

import com.actions.IAction;

public class ShowDialog implements IAction{

	
	/**
	 * @return Exit
	 */
	@Override
	public String getName() {
		return "ShowDialog";
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
		return String.format("%s()", getName() );
	}

}
