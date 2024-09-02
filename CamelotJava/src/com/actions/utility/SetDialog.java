package com.actions.utility;

import com.actions.IAction;

public class SetDialog implements IAction{
	String dialog;
	
	/**
	 * 
	 * @param dialog The dialog to append
	 */
	public SetDialog(String dialog) {
		this.dialog=dialog;
	}
	
	/**
	 * @return SetDialog
	 */
	@Override
	public String getName() {
		return "SetDialog";
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
		return String.format("%s(%s)", getName(), dialog);
	}

}
