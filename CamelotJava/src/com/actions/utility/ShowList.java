package com.actions.utility;
import com.entities.Characters;
import com.actions.IAction;

public class ShowList implements IAction {

	@Override
	public String getName() {
		return "ShowList";
	}

	@Override
	public boolean getShouldWait() {
		return false;
	}
	
	Characters character;
	public ShowList(Characters character) {
		this.character = character;
	}
	
	public String toString() {
		return String.format("%s(%s)", getName(), character.getName());
	}

}
