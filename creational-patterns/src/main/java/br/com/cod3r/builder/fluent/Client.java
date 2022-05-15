package br.com.cod3r.builder.fluent;

import br.com.cod3r.builder.fluent.model.FastFoodMeal;

public class Client {

    public static void main(String[] args) {
        FastFoodMeal xBurgerCombo = new FastFoodMealBuilder("Fries")
                .andMain("XBurger")
                .forDrink("Coke")
                .thatsAll();
        System.out.println(xBurgerCombo);

        FastFoodMeal heartAttackCombo = new FastFoodMealBuilder("Fries")
                .thatsAll();

        System.out.println(heartAttackCombo);


    }
}
