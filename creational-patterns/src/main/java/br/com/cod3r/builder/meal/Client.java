package br.com.cod3r.builder.meal;

import br.com.cod3r.builder.meal.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.meal.builder.FatMealBuilder;
import br.com.cod3r.builder.meal.builder.JustFriesBuilder;
import br.com.cod3r.builder.meal.director.MealDirector;

public class Client {
	
	public static void main(String[] args) {

		order("Just Fries", new JustFriesBuilder());
		order("Heart Atack", new FatMealBuilder());
	}

	public static void order(String name, FastFoodMealBuilder builder) {
		System.out.println("Ordering a " + name);
		MealDirector director = new MealDirector(builder);
		director.constructCombo();
		System.out.println(director.getCombo());
		System.out.println("--------------------");

	}
}