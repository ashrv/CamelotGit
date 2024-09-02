package com.actions;

/**
 * Sets the duration of camera transitions when using SetCameraMode and SetCameraFocus. 
 * Starting this action causes the current camera transition to be finished instantly.
 * The default value is 0.75 seconds.
 * @author Alireza Shirvani
 * @see com.actions.SetCameraFocus
 * @see com.actions.SetCameraMode
 */
public class SetCameraBlend implements IAction{
	int seconds;
	boolean waitForCompletion;
	/**
	 * 
	 * @param seconds The number of seconds it should take to change the camera mode or focus.
	 */
	public SetCameraBlend(int seconds) {
		this.seconds =seconds;
	}
	/**
	 * @return SetCameraBlend
	 */
	@Override
	public String getName() {
		return "SetCameraBlend";
	}

	/**
	 * The experience manager waits for the completion of this action
	 * @return true
	 */
	@Override
	public boolean getShouldWait() {
		return true;
	}

	@Override
	public String toString() {
		return String.format("%s(%d)", getName(), seconds);
	}
}
