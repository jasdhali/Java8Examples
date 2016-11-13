package lambdas;

public class TesterProgram {
	public static void main(String[] args) {
		TesterProgram tp = new TesterProgram();
		//type 
		MathOperation add = (int x,int y)-> x+y;
		
		System.out.println( "20+5" + tp.operate(20, 5, add) );
	}
	
	interface MathOperation{
		int operation(int x,int y);
	}

	interface GreetingService{
		void sayMessage(String msg);
	}
	
	private int operate(int x,int y,MathOperation mOperation){
		return mOperation.operation(x, y);
	}
}