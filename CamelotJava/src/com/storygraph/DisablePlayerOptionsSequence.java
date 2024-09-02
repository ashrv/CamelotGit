package com.storygraph;

import java.util.List;

import com.actions.utility.DisableIcon;
import com.playerInput.*;
import com.sequences.ActionSequence;

public class DisablePlayerOptionsSequence extends ActionSequence{
	public DisablePlayerOptionsSequence(List<Edge> options) {
		for(var option:options) {
			if(option.getChoice() instanceof PlayerInteraction)
				add(new DisableIcon((PlayerInteraction)option.getChoice()));
		}
	}
	
}
