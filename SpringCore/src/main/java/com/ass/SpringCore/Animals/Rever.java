package com.ass.SpringCore.Animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rever {
	@Autowired
	private AnimalsProject animal;
	
	public void goToDrinkWater() {
		animal.drinkWater();
		System.out.println("its rever Project");		
	}

}
