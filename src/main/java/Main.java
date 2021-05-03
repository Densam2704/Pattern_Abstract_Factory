//Inspired by
// https://refactoring.guru/ru/design-patterns/abstract-factory

// example
/*			Plant 	Herbivore 	Predator
Forest      Oak		Rabbit		Wolf
Swamp		Moss	beaver		Crocodile
Sand		Cactus	Camel		Scorpion
 */

import Factories.ForestFactory;
import Factories.SandFactory;
import Factories.SwampFactory;
import Interfaces.WildFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public class Main {
  public static void main(String[] args) {
  
    WildFactory factory = null;
	  
	System.out.println("What do you want to create?\n 1 - forest\n 2 - sand\n 3 - swamp");
	
	try {
	  char symbol = (char) System.in.read();
	  switch (symbol){
		case '1':
		  factory = new ForestFactory();
		  break;
		case '2':
		  factory = new SandFactory();
		  break;
		case '3':
		  factory = new SwampFactory();
		  break;
		default:
		  System.out.println("Wrong button");
		  break;
	  }
	  if (factory!=null)
	  	useFactory(factory);
	} catch (IOException e) {
	  e.printStackTrace();
	}
  
  }
  
  private static void useFactory(WildFactory factory){
	factory.createHerbivore().getHerbivoreName();
	factory.createPlant().getPlantName();
	factory.createPredator().getPredatorName();
  }
		
}
