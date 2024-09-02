package com.playerInput;

import com.entities.IInteract;
import com.enums.*;
import com.entities.Characters;

/**
 * PlayerInteraction is the class you must use to create a player choice via interacting with other entities. 
 * For example a character sitting on a chair or taking an item from another character
 * @author Alireza Shirvani
 * @see com.playerInput.IPlayerChoice
 */
public class PlayerInteraction implements IPlayerChoice{
	public Characters player;
	public String action;
	public IInteract target;
	public Icons icon;
	public String description;
	public boolean isDefault;
	/**
	 * These icons are only visual and have no other effect on the code.
	 * @author Alireza Shirvani
	 *
	 */
	public enum Icons{
		arrest,draw,drink,exit,forge,kneel,listen,lockpick,research,swords,talk,
		unlock,usekey,armour,beard,boot,crown,dress,gloves,helm,paintbrush,palette,
		sewing,brokenheart,charm,firespell,hurt,skull,snowflake,star,bed,cauldron,
		chair,chest,door,fireplace,lockedchest,lockeddoor,plant,target,throne,well,
		woodendoor,Items,apple,book,bookshelf,bread,chickenleg,coins,darkmagic,evilbook,
		flask,flower,healingpotion,ink,key,lovepotion,magnifyingglass,openscroll,padlock,
		poison,potion,present,ring,scroll,sword,torch,woodpile,Other,cancel,checkmark,
		dice_five,dice_four,dice_one,dice_six,dice_three,dice_two,fist,hand,hourglass,meal,
		music,sleep,snake,sunrise,time,tree,anvil,bridge,campfire,castle,city,cottage,
		dungeon,forest,mug,ship,shopsign,stonepath
	}

	/**
	 * Use this constructor for the choices where the player enters the vicinity of an entity.
	 * @param player The character object that represents the player.
	 * @param action Give a unique action name to this choice.
	 * @param target The player makes this choice by entering the vicinity of this interactable..
	 */
	public PlayerInteraction(Characters player, String action, IInteract target) {
		this.player = player;
		this.action=action;
		this.target=target;
	}
	
	/**
	 * Use this constructor for the choices where the player must right click on an interactable to make a choice.
	 * @param action Give a unique action name to this choice.
	 * @param target The entity that the player must right click on to make this choice.
	 * @param icon Choose an icon that is shown to the player for this option.
	 * @param description Give a description of the action that is shown to the player for this option.
	 */
	public PlayerInteraction(String action, IInteract target, Icons icon, String description) {
		this.action=action;
		this.target=target;
		this.icon=icon;
		this.description=description;
		this.isDefault=false;
	}
	
	@Override
	public String getInputMsg() {
		if(player!=null) {
			for(var path:PathTypes.values()) {
				if(target.getName().contains(path.toString())) {
					return String.format("input arrived %s position %s", player.getName(), target.getName());
				}
			}
		}
		return String.format("input %s %s", action, target.getName());
	}
}
