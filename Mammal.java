//mammal is the supercalss , where gorilla the subclass will inherit from
package com.codingdojo.mammal;

public class Mammal{
	public Integer energyLevel;
	public Mammal() {
		this.energyLevel = 100;
	}
	public Integer displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
		
	}

}


	