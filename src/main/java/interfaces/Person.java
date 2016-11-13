package interfaces;

public interface Person {
	default void print() {
		System.out.println("My name is Kira");
	}

	public static void main(String... args) {
		System.out.println("1");
		Person p = new Person() {

			@Override
			public void print() {
				Person.super.print();
			}

		};
		System.out.println("2");
	}
}
