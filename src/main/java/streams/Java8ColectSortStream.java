package streams;

import java.util.List;
import java.util.stream.Collectors;

import model.Dish;
import model.DishDataBase;

public class Java8ColectSortStream {
	public static void main(String[] args) {
	List<String> lowCalDishNames = null;
			List<Dish>	dishList = DishDataBase.getData( false );
			//lowCalDishNames = dishList.stream().filter(p->p.getCalories()<400).sorted( comparing(Dish::getName) ).map(Dish::getName).collect(Collectors.toList());
			//sorted( comparing(Dish::getCalories))
			System.out.println( lowCalDishNames  );
	}	
}
