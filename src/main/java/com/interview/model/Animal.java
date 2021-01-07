package com.interview.model;


public class Animal {
	
	private String nama;
	private String harimau;
	private String kucingGarong;
	
	public Animal() {
		
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getHarimau() {
		return harimau;
	}

	public void setHarimau(String harimau) {
		this.harimau = harimau;
	}

	public String getKucingGarong() {
		return kucingGarong;
	}

	public void setKucingGarong(String kucingGarong) {
		this.kucingGarong = kucingGarong;
	}

	public Animal(String nama, String harimau, String kucingGarong) {
		super();
		this.nama = nama;
		this.harimau = harimau;
		this.kucingGarong = kucingGarong;
	}

	

}
