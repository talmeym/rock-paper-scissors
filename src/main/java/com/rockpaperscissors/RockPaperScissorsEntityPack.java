package com.rockpaperscissors;

import com.emarte.regurgitator.core.*;

public class RockPaperScissorsEntityPack extends AbstractEntityPack {
	public RockPaperScissorsEntityPack() {
		addValueGenerator("rock-paper-scissors-choice", new RockPaperScissorsChoice());
	}
}
