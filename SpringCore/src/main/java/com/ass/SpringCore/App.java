package com.ass.SpringCore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ass.SpringCore.Animals.Lion;
import com.ass.SpringCore.Animals.Rever;
import com.ass.SpringCore.Animals.snake;
import com.ass.SpringCore.config.Applicationconfig;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Applicationconfig.class);
        context.refresh();
        
        snake bean = context.getBean(snake.class);
        Lion bean2 = context.getBean(Lion.class);
        Rever bean3 = context.getBean(Rever.class);
        bean3.goToDrinkWater();
        
    }
}
