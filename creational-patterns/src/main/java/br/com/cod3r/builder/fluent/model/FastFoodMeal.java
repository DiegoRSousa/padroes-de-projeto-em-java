package br.com.cod3r.builder.fluent.model;

public class FastFoodMeal {

	private final String drink;
	private final String main;
	private final String side;
	private final String dessert;
	private final String gift;

	public FastFoodMeal(String drink, String main, String side, String dessert, String gift) {
		this.drink = drink;
		this.main = main;
		this.side = side;
		this.dessert = dessert;
		this.gift = gift;
	}

	public String getDrink() {
		return drink;
	}

//	public String getMain() {
//		return main;
//	}

	public String getSide() {
		return side;
	}

	public String getDessert() {
		return dessert;
	}

	public String getGift() {
		return gift;
	}


	@Override
	public String toString() {
		return "Combo [drink=" + drink + ", main=" + main + ", side=" 
				+ side + ", dessert=" + dessert + ", gift=" + gift + "]";
	}
}
