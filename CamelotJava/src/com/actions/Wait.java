package com.actions;

/**
 * The action succeeds after the specified number of seconds.
 * @author Alireza Shirvani
 *
 */
public class Wait implements IAction {
	/**
	 * The experience manager waits for the completion of this action
	 * @return true
	 */
	@Override
	public boolean getShouldWait() {
		return true;
	}
	
	/**
	 * @return Wait
	 */
	@Override
	public String getName() {
		return "Wait";
	}
	
	/**
	 * 
	 * @param seconds The number of seconds to wait
	 */
	public Wait(int seconds) {
		this.seconds = seconds;
	}
	
	private int seconds;

	@Override
	public String toString() {
		return String.format("%s(%d)", getName(), seconds);
	}



}
