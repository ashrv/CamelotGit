package com.sequences;

import java.util.List;

import com.actions.Create;
import com.entities.ICreate;
/**
 * Use this class to create all places and items in your story.
 * Use CreateCharacterSequence to create your characters instead.
 * @author Alireza Shirvani
 * @see com.sequences.CreateCharacterSequence
 */
public class CreateAll extends ActionSequence {
	/**
	 * 
	 * @param list A list of places and or items that you want to create. Use List.of to create a list of these objects.
	 */
	public CreateAll(List<ICreate<?>> list) {
		list.forEach(z->add(new Create<ICreate<?>>(z)));
	}
}
