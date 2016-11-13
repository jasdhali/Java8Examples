package lambdas;

public class LamdbaDemo2 {
	public static void main(String[] args) {
		NumericTest isEven = (a)->a%2==0;
		if( isEven.test(10) ) System.out.println( "10  is even" );
		if( !isEven.test(19) ) System.out.println( "19 is not even" );
		
		NumericTest isNonNeg = (b)->b>=0;
		
	}
}
