package com.interview.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.interview.model.Animal;

@Service
public class AnimalServiceImpl {

	private static AnimalService list = new AnimalService();
	
	static {
		list.getKucing().add(new Animal("species kucing 1", "harimau budi 1", "kucing garong pantura 1"));
		list.getKucing().add(new Animal("species kucing 2", "harimau budi 2", "kucing garong pantura 2"));
	}

	public AnimalService getAllAnimal() {
		return list;
	}
}
