package com.interview.service;

import java.util.ArrayList;
import java.util.List;

import com.interview.model.Kucing;

public class AnimalService {
	private List<Kucing> kucing;

	public List<Kucing> getKucing() {
		if (kucing == null) {
			kucing = new ArrayList<>();
		}
		return kucing;
	}

	public void setKucing(List<Kucing> kucing) {
		this.kucing = kucing;
	}
	
	
}
