package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DishDataBase {
	private static List<Dish> listDishes = new ArrayList<Dish>();
	static {
		Dish d1 = new Dish(100, "Tea");
		Dish d2 = new Dish(300, "Subway Sandwich");
		Dish d3 = new Dish(400, "Salmon Fillet");
		Dish d4 = new Dish(1000, "Moca Latte");
		listDishes.add(d4);
		listDishes.add(d3);
		listDishes.add(d2);
		listDishes.add(d1);
	}
	private static Map<Integer,String> dishTypmap = new HashMap<Integer,String>();
	
	private static void init(){
		dishTypmap.put(new Integer(1), "Wine");
		dishTypmap.put(new Integer(2), "Milk");
		dishTypmap.put(new Integer(3), "Apple");
		dishTypmap.put(new Integer(4), "Orange");
		dishTypmap.put(new Integer(5), "Carrot");
		dishTypmap.put(new Integer(6), "Chappatti");
		dishTypmap.put(new Integer(7), "Egg Ommelltte");
		for(int x=1;x<=2000;x++){
			 int factor = x%7==0?7:x%7;
			// System.out.println(factor);
			 Dish d = new Dish(100*factor, dishTypmap.get(factor)+"-"+x);
			 listDishes.add( d );
		}
	}
	public static void main(String[] args) {
		init();
		System.out.println( listDishes );
	}
	
	public static List<Dish> getData(boolean flag){
		if( flag )
		init();
		return listDishes; 
	}	
}
