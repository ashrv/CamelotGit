package com.sequences;

import java.util.List;
import com.entities.*;
import com.entities.Characters;
import com.actions.utility.*;
/**
 * Use this class to display a list of interactables. 
 * The list structure keeps track of a set of items that could be used to represent the contents of a furniture or the possessions of a character, provided by the argument of this action. 
 * A front view of the entity specified by the argument is displayed on the left side of the list.
 * The player can close the list window by pressing the X button at the top right.
 * Use the CloseListChoice to capture this choice.
 * Use HideList to hide the list window.
 * @author Alireza Shirvani
 * @see com.entities.IInteract
 * @see com.entities.Characters
 * @see com.actions.HideList
 * @see com.playerInput.CloseListChoice
 */
public class ListSequence extends ActionSequence{
	public ListSequence(Characters character, List<IInteract> items) {
		add(new ClearList());
		for(var item:items) {
			add(new AddToList(item));
		}
		add(new ShowList(character));
	}
}
