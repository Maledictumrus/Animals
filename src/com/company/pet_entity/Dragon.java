package com.company.pet_entity;

import java.util.Comparator;

import com.company.base.classes.Animal;
import com.company.base.enums.DragonType;
import com.company.base.petplay.PetPlay;

public class Dragon extends Animal implements PetPlay {
	public static final Comparator<Dragon> BY_TYPE = new Comparator<Dragon>() {
		@Override
		public int compare(Dragon o1, Dragon o2) {
			return o1.getDragonType().compareTo(o2.getDragonType());
		}
	};
    public static Comparator<Dragon> BY_DRAGON_NAME = new Comparator<Dragon>() {
        @Override
        public int compare(Dragon o1, Dragon o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
	private DragonType dragonType;

	public Dragon(String breed, int weight, String name, DragonType dragonType) {

		super(breed, weight, name);
		this.dragonType = dragonType;
	}

	public DragonType getDragonType() {
		return dragonType;
	}

	public void setDragonType(DragonType dragonType) {
		this.dragonType = dragonType;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Dragon{");
		sb.append("breed='").append(getBreed()).append('\'');
		sb.append(", weight=").append(getWeight());
		sb.append(", name='").append(getName()).append('\'');
		sb.append(", dragonType=").append(dragonType);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public void play() {
		System.out.println(getName() + ": \"This meaningless exertion bores me. I'll " +
				"incinerate you all from above!\"");
	}

	@Override
	public void makeSound() {
		System.out.println(getName() + ": \"GRAHHHHHHHHHH!!!\"");
	}
}
