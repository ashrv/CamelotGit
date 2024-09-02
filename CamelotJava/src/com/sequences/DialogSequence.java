package com.sequences;

import java.util.List;

import com.entities.Characters;
import com.actions.utility.*;
/**
 * Use this class to create a dialog with one or more lines and one or more dialog options.
 * Use HideDialog when you want to close the dialog window.
 * @author Alireza Shirvani
 * @see com.actions.HideDialog
 * @see com.entities.Characters
 */
public class DialogSequence extends ActionSequence{
	/**
	 * 
	 * @param speaker The character displayed on the left side of the dialog window.
	 * @param other The character displayed on the right side of the dialog window. If none, enter null.
	 * @param lines The lines of dialog that appear in order on the dialog window.
	 * @param options The options that the player can choose from. 
	 * If your dialog has no options, it is recommended to add at least have one option to close the dialog.
	 */
	public DialogSequence(Characters speaker, Characters other, List<String> lines, List<String> options) {
		add(new SetLeft(speaker));
		add(new SetRight(other));
		for(var line:lines) {
			add(new SetDialog(line));
		}
		for(var option:options) {
			add(new SetDialog(String.format("[%s|%s]", option.replaceAll("[^A-Za-z]+", ""), option)));
		}
		add(new ShowDialog());
		
	}
}
