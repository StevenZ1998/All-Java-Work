package com.skillstorm.data;
import java.util.List;

import com.skillstorm.beans.Animal;

public interface AnimalDAOInterface {
	
	Animal saveAnimal(Animal animal);
	Animal pullTable();
	List<Animal> pullAnimal(String name);
	void deleteAnimal(int animalId);
	void infoUpdateAnimal(Animal animal);	
	
}
