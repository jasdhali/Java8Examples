package datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;

public class TimeApiTester {

	public static void main(String[] args) {
		Duration duration = Duration.ofMinutes(30);
		System.out.println(duration);
		
		Instant instant = Instant.now();
		System.out.println( instant );
		
		LocalDate ld = LocalDate.now();
		
		System.out.println( ld );
	}

}
