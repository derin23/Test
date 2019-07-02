package com.dj.diegame.dice;

import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Dice {
	@Id
	@GeneratedValue
	private Long id;
	
	private int cup;
	Random rand = new Random(6);

	public Random getRand() {
		return rand;
	}
	
	public Dice(int cup, Random rand) {
		this.cup = cup;
		this.rand = rand;
	}
	public Dice() {}
	
	
}
