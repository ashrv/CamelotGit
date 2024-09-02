package com.actions;

import com.entities.IInteract;

/**
Set the focus of the main camera to an entity. 
If that entity is a character and input is enabled, the character can be controlled by the mouse and keyboard. 
Action succeeds after the camera transition is finished or interrupted by another action.
 * @author Alireza Shirvani
 * @see com.entities.IInteract
 */
public class SetCameraFocus implements IAction{
	private IInteract focus;
	private boolean doNotWait;
	/**
	 * By default, the experience manager waits for this action to succeed.
	 * @param focus The entity that the camera will focus on.
	 */
	public SetCameraFocus(IInteract focus) {
		this.focus=focus;
	}
	/**
	 * @param focus The entity that the camera will focus on.
	 * @param doNotWait If you want to contine running actions while the transition is happening, set this to true.
	 */
	public SetCameraFocus(IInteract focus, boolean doNotWait) {
		this.focus=focus;
		this.doNotWait = doNotWait;
	}
	/**
	 * @return SetCameraFocus
	 */
	@Override
	public String getName() {
		return "SetCameraFocus";
	}

	/**
	 * The experience manager may wait or not wait for the completion of this action
	 * @return true or false
	 */
	@Override
	public boolean getShouldWait() {
		return !doNotWait;
	}

	@Override
	public String toString() {
		return String.format("%s(%s)", getName(), focus.getName());
	}
}
