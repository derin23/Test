package com.dj.diegame.dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DiceController {

	@Autowired
	private DiceRepo diceRepo;
//	@Autowired
	private Dice dice;
	
//	@Autowired
	private Cup cup;
	
	@GetMapping("/")
	public String getIndex(Dice dice, Cup cup, Model model) {
		
		return "index";
	}
	@PostMapping("/")
	public String rollDice(Dice dice, Cup cup, Model model) {
		diceRepo.save(dice);
		//model.addAttribute("amount",cup.setDiceNum(cup));
		
//		System.out.println(dice.toString());
//		System.out.println(cup.toString());
//		System.out.println(model.toString());
		return "index";
	}
}
