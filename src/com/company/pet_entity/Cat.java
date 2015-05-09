package com.company.pet_entity;

import java.util.Comparator;

import com.company.base.classes.Animal;
import com.company.base.petplay.PetPlay;

public class Cat extends Animal implements PetPlay, Comparator<Cat> {
	public static Comparator<Cat> BY_EAR_TYPE = new Comparator<Cat>() {
		@Override
		public int compare(Cat o1, Cat o2) {
			return o1.isFlapEared().compareTo(o2.isFlapEared());
		}
	};

    public static Comparator<Cat> BY_CAT_NAME = new Comparator<Cat>() {
        @Override
        public int compare(Cat o1, Cat o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
	private Boolean flapEared;

	public Cat(String breed, int weight, String name, Boolean flapEared) {
		super(breed, weight, name);
		this.flapEared = flapEared;
	}


	public Boolean isFlapEared() {
		return flapEared;
	}

	public void setFlapEared(Boolean flapEared) {
        this.flapEared = flapEared;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Cat{");
		sb.append("breed='").append(getBreed()).append('\'');
		sb.append(", weight=").append(getWeight());
		sb.append(", name='").append(getName()).append('\'');
		sb.append(", flapEared=").append(flapEared);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public void play() {
		System.out.println(getName() + ": \"Meow!\"");
	}

	@Override
	public int compare(Cat o1, Cat o2) {
		return 0;
	}

	@Override
	public void makeSound() {
		System.out.println(getName() + ": \"Meoooooo~w.\"");
	}
}
