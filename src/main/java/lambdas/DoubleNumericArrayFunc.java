package lambdas;

public interface DoubleNumericArrayFunc {
	double func(double[] dArrray) throws EmptyArrayException;
}
class EmptyArrayException extends Exception{
	EmptyArrayException(){
		super("Array is Empty");
	}
}
