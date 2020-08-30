package com.skillstorm.service;

import java.util.List;

import com.skillstorm.beans.Animal;
import com.skillstorm.data.AnimalDAO;

public class AnimalService {
	
	AnimalDAO adao = new AnimalDAO();
	
	public Animal saveAnimal(Animal animal) {
		return adao.saveAnimal(animal);
	}
	
	public Animal pullTable() {
		return adao.pullTable();
	}
	
	public List<Animal> pullAnimal(String name) {
		return adao.pullAnimal(name);
	}
	
	public void deleteAnimal(int animalId) {
		adao.deleteAnimal(animalId);
	}
	
	public void infoUpdateAnimal(Animal animal) {
		adao.infoUpdateAnimal(animal);
	}
	
}
