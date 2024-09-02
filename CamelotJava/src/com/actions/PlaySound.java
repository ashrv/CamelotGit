package com.actions;

/**
 * Plays a short sound effect or background music. Refer to <a href="http://cs.uky.edu/~sgware/projects/camelot/v1-2/sfx.html">here</a> to see the available sound effects.
 * @author Alireza Shirvani
 * @see <a href="http://cs.uky.edu/~sgware/projects/camelot/v1-2/sfx.html">Sound effects</a>
 */
public class PlaySound implements IAction{
	String sound;
	/**
	 * 
	 * @param sound The sound effect to play from the list of available effects.
	 */
	public PlaySound(String sound) {
		this.sound = sound;
	}

	/**
	 * @return PlaySound
	 */
	@Override
	public String getName() {
		return "PlaySound";
	}
	/**
	 * The experience manager does not wait for the completion of this action
	 * @return false
	 */
	@Override
	public boolean getShouldWait() {
		return false;
	}
	
	@Override
	public String toString() {
			return String.format("%s(%s)", 
					getName(), 
					sound);
	}

}
