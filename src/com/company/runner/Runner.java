package com.company.runner;

import com.company.base.Source;
import com.company.base.classes.Animal;
import com.company.pet_entity.Cat;
import com.company.pet_entity.Dragon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Runner {

	List<Animal> animals;

	public static void main(String[] args) {
		// write your code here
		Runner application = new Runner();
		application.loop();
	}

	private void playWithDragons(List<Animal> animals) {
		List<Dragon> dragons = new ArrayList<Dragon>();

		for (Animal animal : animals) {
			if (animal instanceof Dragon) {
				Dragon dragon = (Dragon) animal;
				dragons.add(dragon);
			}
		}

		Collections.sort(dragons, Dragon.BY_TYPE);
		for (Dragon dragon : dragons) {
			System.out.println(dragon);
			dragon.play();
			dragon.makeSound();
		}

	}
    private void sortDragons(List<Animal> animals) {
        List<Dragon> dragonsort = new ArrayList<Dragon>();
        for (Animal animal : animals) {
			if (animal instanceof Dragon) {
				Dragon dragon = (Dragon) animal;
				dragonsort.add(dragon);
			}
		}

        Collections.sort(dragonsort, Dragon.BY_DRAGON_NAME);
            for (Dragon dragon : dragonsort) {
            System.out.println(dragon);
            dragon.makeSound();
            }

    }
	private void playWithCats(List<Animal> animals) {
		List<Cat> cats = new ArrayList<Cat>();

		for (Animal animal : animals) {
			if (animal instanceof Cat) {
				Cat cat = (Cat) animal;
				cats.add(cat);
			}
		}
		Collections.sort(cats, Cat.BY_EAR_TYPE);
		for (Cat cat : cats) {
			System.out.println(cat);
			cat.makeSound();
			cat.play();
		}
	}
    private void sortCats(List<Animal> animals) {
        List<Cat> cats = new ArrayList<Cat>();

        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cats.add(cat);
            }
        }
        Collections.sort(cats, Cat.BY_CAT_NAME);
        for (Cat cat : cats) {
            System.out.println(cat);
            cat.makeSound();
        }
    }

	private void sortAnimals(List<Animal> animals) {
		System.out.println("Sorting all animals by weight:");
		Collections.sort(animals);

		for (Animal animal : animals) {
			System.out.println(animal);
		}
		System.out.println();
	}

	private void loop() {
		while (true) {
            animals = Source.spawn();
            menu();
		}
	}

	private void menu() {
		char shortcut;
		Scanner in = new Scanner(System.in);
		System.out.print("\nYou can play with (C)ats, (D)ragons, (S)ort 'em " +
				"all, Sor(T)dragons by name, sort cats by (N)ame or just (Q)uit. Choose your destiny! ");

		shortcut = Character.toUpperCase(in.next().charAt(0));
		switch (shortcut) {
			case 'C':
				playWithCats(animals);
				break;
			case 'D':
				playWithDragons(animals);
				break;
			case 'S':
				sortAnimals(animals);
				break;
            case 'T':
                sortDragons(animals);
                break;
            case 'N':
                sortCats(animals);
                break;
			case 'Q':
				System.exit(0);
				break;

		}

	}
}