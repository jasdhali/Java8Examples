package datetime;

import java.time.Duration;
import java.time.LocalTime;

public class DurationDemoTime {
	
	public static void main(String[] args) {
		LocalTime lt  = LocalTime.now();
		
		LocalTime lt2  = LocalTime.of(10, 10, 30);
		
		System.out.println( lt );
		
		System.out.println( lt2 );		
		Duration d = Duration.between(lt, lt2);
		System.out.println(d);
	}
}
