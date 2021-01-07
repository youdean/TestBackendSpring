package com.interview.model;

import java.util.List;

public class Kucing {
	
	private String nama;
	private List<Harimau> harimau;
	private List<KucingGarong> kucingGarong;
	
	public Kucing(String nama) {
		super();
		this.nama = nama;
	}

	public Kucing(String nama, List<Harimau> harimau, List<KucingGarong> kucingGarong) {
		super();
		this.nama = nama;
		this.harimau = harimau;
		this.kucingGarong = kucingGarong;
	}

	public void setHarimau(List<Harimau> harimau) {
		this.harimau = harimau;
	}

	public void setKucingGarong(List<KucingGarong> kucingGarong) {
		this.kucingGarong = kucingGarong;
	}

	public List<Harimau> getHarimau() {
		return harimau;
	}

	public List<KucingGarong> getKucingGarong() {
		return kucingGarong;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	

}
