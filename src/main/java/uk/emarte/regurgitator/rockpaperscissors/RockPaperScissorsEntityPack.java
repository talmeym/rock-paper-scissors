package uk.emarte.regurgitator.rockpaperscissors;

import uk.emarte.regurgitator.core.*;

public class RockPaperScissorsEntityPack extends AbstractEntityPack {
	public RockPaperScissorsEntityPack() {
		addValueGenerator("rock-paper-scissors-choice", new RockPaperScissorsChoice());
	}
}
