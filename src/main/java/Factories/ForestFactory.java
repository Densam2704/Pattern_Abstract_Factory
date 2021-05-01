package Factories;

import ConcreteProducts.ForestHerbivore;
import ConcreteProducts.ForestPlant;
import ConcreteProducts.ForestPredator;
import Interfaces.Herbivore;
import Interfaces.Plant;
import Interfaces.Predator;
import Interfaces.WildFactory;

public class ForestFactory implements WildFactory {
  public Plant createPlant() {
	return new ForestPlant();
  }
  
  public Herbivore createHerbivore() {
	return new ForestHerbivore();
  }
  
  public Predator createPredator() {
	return new ForestPredator();
  }
}
