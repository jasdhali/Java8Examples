package methodreference;

import java.util.ArrayList;
import java.util.List;

public class TesterProgram {

	public static void main(String[] args) {
		List<String> ns1 = new ArrayList<String>();
		ns1.add("Kira");ns1.add("Life");ns1.add("Nicholas");ns1.add("Samuel");ns1.add("John");
		ns1.forEach(System.out::println );
	}

}
