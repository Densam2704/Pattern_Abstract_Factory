package Factories;

import ConcreteProducts.SandHerbivore;
import ConcreteProducts.SandPlant;
import ConcreteProducts.SandPredator;
import ConcreteProducts.SwampPredator;
import Interfaces.Herbivore;
import Interfaces.Plant;
import Interfaces.Predator;
import Interfaces.WildFactory;

public class SandFactory implements WildFactory {
  public Plant createPlant() {
	return new SandPlant();
  }
  
  public Herbivore createHerbivore() {
	return new SandHerbivore();
  }
  
  public Predator createPredator() {
	return new SandPredator();
  }
}
