package com.interview.service;

import java.util.ArrayList;
import java.util.List;

import com.interview.model.Animal;

public class AnimalService {
	private List<Animal> kucing;

	public List<Animal> getKucing() {
		if (kucing == null) {
			kucing = new ArrayList<>();
		}
		return kucing;
	}

	public void setKucing(List<Animal> kucing) {
		this.kucing = kucing;
	}
	
	
}
