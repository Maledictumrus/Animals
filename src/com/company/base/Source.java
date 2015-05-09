package com.company.base;

import com.company.base.classes.Animal;
import com.company.base.enums.DragonType;
import com.company.pet_entity.Cat;
import com.company.pet_entity.Dragon;

import java.util.ArrayList;
import java.util.List;

public class Source {
	public static final int WHELP_COUNT = 2;

	public static List<Animal> spawn() {
		List<Animal> animals = new ArrayList<Animal>();
		Cat shortcat = new Cat("Arara", 3, "Shortcat", true);
		Cat longcat = new Cat("Weeeeeeeeeeeedcat", 10, "Longcat", false);
        Cat fatcat = new Cat("GREEZY",15,"Fatty", false );
		Dragon onyxia = new Dragon("Black Dragon", 9000, "Onyxia", DragonType
				.DRAGON_FIRE_BREATHING);
        Dragon nefarian = new Dragon("Black Dragon", 7500, "Nefarian", DragonType.DRAGON_UNDEAD);


		animals.add(longcat);
		animals.add(onyxia);
		animals.add(shortcat);
        animals.add(nefarian);
        animals.add(fatcat);

		//cloning whelps
		int whelp_id = 0;
		for (int i = 0; i < WHELP_COUNT; i++) {
			Dragon whelp = new Dragon("Whelp", 23, "Whelp " + ++whelp_id,
					DragonType.DRAGON_MAGICAL);
			animals.add(whelp);

		}
		return animals;
	}
}