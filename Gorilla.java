package com.codingdojo.mammal;

public class Gorilla extends Mammal{
		public void throwSomething() {
			System.out.println("the gorilla has thrown something");
			this.energyLevel = energyLevel -5;
			this.displayEnergy();
	}
		public void eatBannanas() {
			System.out.println("the gorilla is full");
			this.energyLevel = energyLevel +10;
			this.displayEnergy();
		}
		public void climb() {
			System.out.println("the gorilla has climbed the tree");
			this.energyLevel = energyLevel - 10;
		}
}
