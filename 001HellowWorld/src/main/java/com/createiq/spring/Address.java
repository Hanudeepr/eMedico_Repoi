package com.createiq.spring;

public class Address {

	private int aid;
	private String aloc;

	public Address(int aid, String aloc) {
		super();
		this.aid = aid;
		this.aloc = aloc;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAloc() {
		return aloc;
	}

	public void setAloc(String aloc) {
		this.aloc = aloc;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", aloc=" + aloc + "]";
	}

}
