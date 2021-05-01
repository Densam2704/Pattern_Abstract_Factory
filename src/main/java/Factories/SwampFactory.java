package Factories;

import ConcreteProducts.*;
import Interfaces.Herbivore;
import Interfaces.Plant;
import Interfaces.Predator;
import Interfaces.WildFactory;

public class SwampFactory implements WildFactory {
  
  public Plant createPlant() {
	return new SwampPlant();
  }
  
  public Herbivore createHerbivore() {
	return new SwampHerbivore();
  }
  
  public Predator createPredator() {
	return new SwampPredator();
  }
}
