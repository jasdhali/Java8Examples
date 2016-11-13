package com.practice.domain;

public class Apple {
	private String category;
	private Float weight;
	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Apple(String category, Float weight) {
		super();
		this.category = category;
		this.weight = weight;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Apple [category=" + category + ", weight=" + weight + "]";
	}
	
}
