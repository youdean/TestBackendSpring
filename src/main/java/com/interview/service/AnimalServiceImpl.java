package com.interview.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.interview.model.Harimau;
import com.interview.model.Kucing;
import com.interview.model.KucingGarong;

@Service
public class AnimalServiceImpl {

	private static AnimalService kucing = new AnimalService();
	private static List<Harimau> harimau = new ArrayList<>();
	private static List<KucingGarong> kucingGarong = new ArrayList<>();
	
	static {
		harimau.add(new Harimau("harimau budi 1"));
		kucingGarong.add(new KucingGarong("kucing garong pantura 1"));
		kucing.getKucing().add(new Kucing("species kucing 1", harimau, kucingGarong));
		harimau.add(new Harimau("harimau budi 2"));
		kucingGarong.add(new KucingGarong("kucing garong pantura 2"));
		kucing.getKucing().add(new Kucing("species kucing 2", harimau, kucingGarong));
	}

	public AnimalService getAllAnimal() {
		return kucing;
	}
}
