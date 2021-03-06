package com.rockpaperscissors;

import com.emarte.regurgitator.core.*;

import java.util.Random;

public class RockPaperScissorsChoice implements ValueGenerator {
	private static Log log = Log.getLog(RockPaperScissorsChoice.class);
	private static Random RANDOM = new Random();

	private static String[] CHOICES = {"rock", "paper", "scissors"};

	@Override
	public Object generate() {
		int choice = RANDOM.nextInt(3);
		log.debug("random is " + choice);
		return CHOICES[choice];
	}
}
