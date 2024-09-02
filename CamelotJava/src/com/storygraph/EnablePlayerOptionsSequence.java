package com.storygraph;

import java.util.List;

import com.actions.utility.EnableIcon;
import com.playerInput.PlayerInteraction;
import com.sequences.ActionSequence;

public class EnablePlayerOptionsSequence extends ActionSequence{
	public EnablePlayerOptionsSequence(List<Edge> options) {
		for(var option:options) {
			if(option.getChoice() instanceof PlayerInteraction)
				add(new EnableIcon((PlayerInteraction)option.getChoice()));
		}  
	}
}
