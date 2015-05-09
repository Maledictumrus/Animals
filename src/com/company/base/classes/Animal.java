package com.company.base.classes;

public abstract class Animal implements Comparable<Animal> {
	private String breed;
	private int weight;
	private String name;

	public Animal(String breed, int weight, String name) {
		this.breed = breed;
		this.weight = weight;
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Animal o) {
		return weight - o.weight;
	}


	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Animal{");
		sb.append("breed='").append(breed).append('\'');
		sb.append(", weight=").append(weight);
		sb.append(", name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
