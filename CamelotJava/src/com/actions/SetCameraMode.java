package com.actions;

/**
 * Set camera mode to track, follow, or focus. 
 * Follow mode is an over-the-shoulder third-person camera that is only available when camera target is a character. 
 * Focus mode focuses the camera on a front view of the camera target. 
 * Track mode views a top-down view of the place where camera target is located. 
 * Action succeeds after the camera transition is finished or interrupted by another action.
 * @author Alireza Shirvani
 * @see com.actions.SetCameraFocus
 * @see com.actions.SetCameraBlend
 */
public class SetCameraMode implements IAction{
	public enum Mode{ follow, track, focus }
	Mode mode;
	
	/**
	 * By default, the experience manager waits for this action to succeed.
	 * @param mode The mode that the camera will switch to.
	 */
	public SetCameraMode(Mode mode) {
		this.mode = mode;
	}
	private boolean doNotWait;
	/**
	 * @param mode The mode that the camera will switch to.
	 * @param doNotWait If you want to continue running actions while the transition is happening, set this to true.
	 */
	public SetCameraMode(Mode mode, boolean doNotWait) {
		this.mode=mode;
		this.doNotWait = doNotWait;
	}
	/**
	 * @return SetCameraMode
	 */
	@Override
	public String getName() {
		return "SetCameraMode";
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
		return String.format("%s(%s)", getName(), mode.toString());
	}
}
