package defaultmethod;

public class TesterProgramDefault {

	public static void main(String[] args) {
		Person person = new Human();
		person.print();
	}

}

interface Person {
	default void print() {
		System.out.println("I am a Person!");
	}

	static void run() {
		System.out.println("I am now running!!!");
	}
}

interface Male {
	default void print() {
		System.out.println("I am a male person!");
	}
}

class Human implements Person, Male {

	@Override
	public void print() {
		Person.super.print();
		Male.super.print();
		Person.run();
		System.out.println("I am a human!");
	}

}