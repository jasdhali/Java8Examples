package interfaces;

public class FormulaImpl {

	public static void main(String[] args) {
		Formula f = new Formula() {
			@Override
			public double calculate(int a) {
				return 1024*a;
			}

			@Override
			public double newcalculate(int a) {
				return 0;
			}
		};
	
	System.out.println( "1-->" + f.calculate(200) );
	System.out.println( "2-->" + f.calculate(20) );
	
	}
}
