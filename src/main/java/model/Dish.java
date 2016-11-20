package model;

public class Dish {
	int calories;
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dish(int calories, String name) {
		super();
		this.calories = calories;
		this.name = name;
	}

	public Dish(int calories) {
		super();
		this.calories = calories;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dish [calories=" + calories + ", name=" + name + "]";
	}
	
}
