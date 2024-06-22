package com.ass.SpringCore.Animals;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Lion")
@Primary
public class Lion implements AnimalsProject {

	@Override
	public void drinkWater() {
		System.out.println("Lion Drink water");
		
	}
	
	

}
