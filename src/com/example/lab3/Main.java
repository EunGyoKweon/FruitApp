package com.example.lab3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		
		Fruit s1 = new Fruit(101, "Apple", 1000);
		fl.add(s1);
		
		Fruit s2 = new Fruit(102, "Orange", 1500);
		fl.add(s2);
		
		Fruit s3 = new Fruit(103, "Banana", 5000);
		fl.add(s3);
		
		Fruit s4 = new Fruit(104, "Kiwi", 3900);
		fl.add(s4);
		
		Fruit s5 = new Fruit(105, "Pineapple", 4300);
		fl.add(s5);
		
		Fruit s6 = new Fruit(106, "Grape", 9800);
		fl.add(s6);
		
		Fruit s7 = new Fruit(107, "Lemon", 11000);
		fl.add(s7);
		
		Fruit s8 = new Fruit(108, "Coconut", 23000);
		fl.add(s8);
		
		Fruit s9 = new Fruit(109, "Pear", 4500);
		fl.add(s9);
		
		Fruit s10 = new Fruit(110, "Watermelon", 5100);
		fl.add(s10);
		
		Collections.sort(fl, new FruitComparator());
		
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List(reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		
		for(int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
	}

}