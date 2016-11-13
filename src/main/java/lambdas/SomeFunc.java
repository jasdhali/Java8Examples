package lambdas;

public interface SomeFunc<T> {
	T func(T t);
}

class GenericFunctionalInterfaceDemo {
	public static void main(String[] args) {
		SomeFunc<String> appendString = s -> {
			return s.concat("XYZ");			
		};
		System.out.println( appendString.func("jaspal"));
		System.out.println("//////////////////");
		
		SomeFunc<Integer> modifyInteger = i->{
			
			return 890;
		};
		
		System.out.println();
	 
	}	
	
	
}
