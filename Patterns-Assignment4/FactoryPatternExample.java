package Patterns;

import java.util.Scanner;

public class FactoryPatternExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter restaurantname and foodtype");
		String restaurantName1 = scanner.next();
		String foodType1 = scanner.next();
		Restaurant restaurant = SelectRestaurant.restaurantName(restaurantName1, foodType1);
		restaurant.makeDish();
	}
}

class SelectRestaurant {

	static Restaurant restaurantName(String restaurantName, String dishType) throws Exception {
		String format = "Day6.";
		FoodType foodType = (FoodType) Class.forName(format.concat(dishType)).newInstance();
		Restaurant restaurant = (Restaurant) Class.forName(format.concat(restaurantName)).newInstance();
		restaurant.setDish(foodType);
		return restaurant;
	}
}

abstract class Restaurant {
	abstract void setDish(FoodType foodType);

	abstract void makeDish();
}

class Sangeetha extends Restaurant {
	FoodType foodType;

	@Override
	void makeDish() {
		// TODO Auto-generated method stub
		foodType.prepare();
	}

	@Override
	void setDish(FoodType foodType) {
		// TODO Auto-generated method stub
		this.foodType = foodType;
	}
}

class Aachi extends Restaurant {
	FoodType foodType;

	@Override
	void makeDish() {
		// TODO Auto-generated method stub
		foodType.prepare();
	}

	@Override
	void setDish(FoodType foodType) {
		// TODO Auto-generated method stub
		this.foodType = foodType;
	}
}

abstract class FoodType {
	abstract void prepare();
}

class SouthIndian extends FoodType {
	@Override
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Southindian dishes readyy");
	}
}

class Tandoori extends FoodType {
	@Override
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Tandoori dishes readyy");
	}
}