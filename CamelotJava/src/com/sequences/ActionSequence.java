package com.sequences;

import java.util.ArrayList;
import java.util.Iterator;

import com.actions.IAction;
import com.communication.Messenger;

/**
 * An object of this class represents a sequence of Camelot Actions
 * @author Alireza Shirvani
 * @see com.actions.IAction
 */
public class ActionSequence implements Iterable<IAction> {
	private ArrayList<IAction> actions = new ArrayList<>();
	/**
	 * This function executes all actions of the sequence in Camelot
	 * @throws Exception 
	 */
	public void execute() throws Exception {
		for(var action:actions) {
			Messenger.getInstance().Send(action);
		}
	}
	
	/**
	 * You can use this function to add a Camelot action to the end of this sequence
	 * @param action The action to add
	 * @return The resulting sequence
	 */
	public ActionSequence add(IAction action) {
		actions.add(action);
		return this;
	}
	
	/**
	 * You can use this function to append another action sequence to the end of this sequence
	 * @param other The other sequence that is appended to this sequence
	 * @return The resulting sequence
	 */
	public ActionSequence add(ActionSequence other) {
		for(var action:other) {
			actions.add(action);
		}
		return this;
	}
	
	@Override
	public Iterator<IAction> iterator() {
		return actions.iterator();
	}
}
