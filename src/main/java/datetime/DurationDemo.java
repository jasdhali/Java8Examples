package datetime;

import java.time.Duration;
import java.time.LocalDate;

public class DurationDemo {
	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.of(2015 , 1 , 20 );
		System.out.println( ld );
		LocalDate ld2 = LocalDate.of( 2015 , 1 , 20 );
		System.out.println( ld2 );
	
		Duration d = Duration.between(ld, ld);
		//System.out.println( d );
	}	
}
