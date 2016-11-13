package lambdas;

public class LambdaExceptionDemo {
	static double[] values = {1.0,2.0,3.0,4.0};
	public static void main(String[] args) throws EmptyArrayException {
		DoubleNumericArrayFunc average = (n) ->{
			double sum = 0.0d;
			if( n.length ==0 ) throw new EmptyArrayException();
			for (int i = 0; i < n.length; i++) {
				sum+=n[i];
			}
			return sum/n.length;
		};
		System.out.println("The average is => " + average.func(values));
		
	}

}
