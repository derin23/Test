package com.dj.diegame.dice;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Cup{

//	@Autowired
//	private Dice dice;
	private int diceNum;

	public int getDiceNum() {
		return diceNum;
	}

	@Override
	public String toString() {
		return "Cup [diceNum=" + diceNum + "]";
	}

	public void setDiceNum(int diceNum) {
		this.diceNum = diceNum;
	}
	
	public Cup(int diceNum) {
		this.diceNum = diceNum;
	}
	public Cup() {}
}
