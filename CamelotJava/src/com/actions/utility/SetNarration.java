package com.actions.utility;

import com.actions.IAction;

public class SetNarration implements IAction{
	String narration;
	
	/**
	 * 
	 * @param narration The narration to show
	 */
	public SetNarration(String narration) {
		this.narration=narration;
	}
	
	/**
	 * @return SetNarration
	 */
	@Override
	public String getName() {
		return "SetNarration";
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
		return String.format("%s(\"%s\")", getName(), narration);
	}

}
