package com.entities;

import com.enums.BodyTypes;
import com.enums.Clothing;
import com.enums.Colors;
import com.enums.HairStyle;
/**
 * A character is an interactable (IInteract) and creatable (ICreate).
 * Instantiating an object of type Character does NOT create the character in Camelot.
 * To do that, you must use CreateCharacterSequence.
 * @author Alireza Shirvani
 * @see com.entities.ICreate
 * @see com.entities.IInteract
 * @see com.sequences.CreateCharacterSequence
 * @see com.enums.Clothing
 * @see com.enums.HairStyle
 * @see com.enums.Colors
 */
public class Characters implements IInteract, ICreate<BodyTypes>{

	private String name;
	@Override
	public String getName() {
		return name;
	}
	
	private BodyTypes bodyType;
	/**
	 * 
	 * @return The body type of this character
	 */
	@Override
	public BodyTypes getTemplate() {
		return bodyType;
	}
	
	private Clothing clothing;
	/**
	 * 
	 * @return The clothing of this character
	 */
	public Clothing getClothing() {
		return clothing;
	}
	
	private HairStyle hair;

	/**
	 * 
	 * @return The hair style of this character
	 */
	public HairStyle getHairStyle() {
		return hair;
	}
	
	private Colors hairColor;

	/**
	 *
	 * @return The hair color of this character
	 */
	public Colors getHairColor() {
		return hairColor;
	}
	
	private int skinColor;

	/**
	 * 
	 * @return The skin color of this character
	 */
	public int getSkinColor() {
		return skinColor;
	}
	
	/**
	 * This constructor will set body type to A, clothing to Peasant, hair style to short, skin color to 4, and hair color to black.
	 * @param name The name of the character object
	 */
	public Characters(String name) {
		this(name, BodyTypes.A);
	}
	
	/**
	 * This constructor will set clothing to Peasant, hair style to short, skin color to 4, and hair color to black.
	 * @param name The name of the character object
	 * @param bodytype The body type of the character object
	 */
	public Characters(String name, BodyTypes bodytype) {
		this(name, bodytype, Clothing.Peasant, HairStyle.Short, Colors.Black, 4);
	}
	
	/**
	 * 
	 * @param name The name of the character object
	 * @param bodyType The body type of the character object
	 * @param clothing The clothing of the character object
	 * @param hair The hair style of the character object
	 * @param hairColor The hair color of the character object
	 * @param skinColor The skin color of the character object
	 */
	public Characters(String name, BodyTypes bodyType, Clothing clothing, HairStyle hair, Colors hairColor, int skinColor) {
		this.name=name.toString();
		this.bodyType=bodyType;
		this.clothing=clothing;
		this.hair = hair;
		this.hairColor = hairColor;
		this.skinColor = skinColor;
	}
}
