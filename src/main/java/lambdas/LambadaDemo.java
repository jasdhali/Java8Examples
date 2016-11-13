package lambdas;

public class LambadaDemo {
	public static void main(String[] args) {
		MyNumber num = () -> 123.23;
		System.out.println( num.getValue() );
	}
}
