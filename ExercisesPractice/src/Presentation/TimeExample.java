package Presentation;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeExample {

	public static void main(String[] args) {

		LocalTime time = LocalTime.now();
		System.out.println("Current Time : "+time);
		
		//Local Date and time class
		
		LocalDateTime dtime = LocalDateTime.now();  
        System.out.println("Before Formatting: " + dtime); 
        
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-YYYY HH:mm:ss");  
        String formatDateTime = dtime.format(format);  
        System.out.println("\nAfter Formatting: " + formatDateTime);  
	}
}
