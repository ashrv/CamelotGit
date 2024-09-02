package com.sequences;

import com.actions.Create;
import com.actions.SetClothing;
import com.actions.SetHairColor;
import com.actions.SetHairStyle;
import com.actions.utility.*;
import com.entities.Characters;
/**
 * Use this class to create each of your characters. 
 * @author Alireza Shirvani
 *
 */
public class CreateCharacterSequence extends ActionSequence{
	public CreateCharacterSequence(Characters character) {
		add(new Create<Characters>(character));
		add(new SetClothing(character));
		add(new SetHairStyle(character));
		add(new SetHairColor(character));
		add(new SetSkinColor(character));
	}
}
