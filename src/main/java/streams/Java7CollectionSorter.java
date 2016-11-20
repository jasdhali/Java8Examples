package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Dish;
import model.DishDataBase;

public class Java7CollectionSorter {

	public static void main(String[] args) {
		List<Dish> listDishes = DishDataBase.getData( false );
		List<Dish> lowCalDishes  = new ArrayList<Dish>();
		for(Dish dish: listDishes){
			if( dish.getCalories() < 400 ){
				lowCalDishes.add( dish );
			}
		}
		
	//	System.out.println( "Unsorted ==> " + lowCalDishes );
		
		Collections.sort( lowCalDishes , new Comparator<Dish>() {

			@Override
			public int compare(Dish o1, Dish o2) {
				return o1.getCalories()-o2.getCalories();
			}
			
		});
	//	System.out.println( "Sorted ==> " + lowCalDishes );
		
		List<String> dishNamesLowCal = new ArrayList<String>();
		for(Dish d : lowCalDishes){
			dishNamesLowCal.add( d.getName() );
		}
		
		System.out.println( dishNamesLowCal );
	}
}
