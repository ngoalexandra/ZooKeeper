package com.codingdojo.mammal;

public class Unicorn extends Mammal {
	public Unicorn() {
		this.energyLevel = 300;
	}
	public void fly() {
		System.out.println("weehhhhhh i'm a flying unicorn, watch me go");
		this.energyLevel = energyLevel - 50;
		this.displayEnergy();
		
	}
	public void eatHumans() {
		System.out.println("humans are yummy nom noms");
		this.energyLevel = energyLevel + 25;
		this.displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("oh no the fluffy unicorn is angry!!!!!");
		this.energyLevel = energyLevel -100;
		this.displayEnergy();
	}
	

}
