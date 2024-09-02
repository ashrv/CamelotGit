package com.actions.utility;

import com.actions.IAction;
import com.entities.IInteract;

public class AddToList implements IAction {
	IInteract item;
	public AddToList(IInteract item) {
		this.item=item;
	}
	@Override
	public String getName() {
		return "AddToList";
	}

	@Override
	public boolean getShouldWait() {
		return false;
	}
	
	public String toString() {
		return String.format("%s(%s)", getName(), item.getName());
	}

}
