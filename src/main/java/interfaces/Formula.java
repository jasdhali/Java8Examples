package interfaces;

//@FunctionalInterface
public interface Formula {
	double calculate(int a);
	
	double newcalculate(int a);
	
	default double sqrt(int a){
		return Math.sqrt(a);
	}
	
	default String msg(int a){
		return new String("Message is ====> " + a );
	}
}


