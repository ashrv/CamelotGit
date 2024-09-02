package com.actions.utility;

import com.actions.IAction;

public class ClearList implements IAction {

	@Override
	public String getName() {
		return "ClearList";
	}

	@Override
	public boolean getShouldWait() {
		return true;
	}
	
	public String toString() {
		return String.format("%s()", getName());
	}

}
