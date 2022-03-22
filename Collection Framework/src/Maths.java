import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Maths {
public static void main(String [] args) {
	//Scanner input=new Scanner(System.in);
	
	int x=7;
	int y=5;
	
	//System.out.println("Enter the number");
	
	//print square root
	System.out.println("Square root of:"+y+ Math.sqrt(y));
	
	System.out.println("Maximum of the :"+x +y+Math.max(x, y));
	
	System.out.println("Power of:"+x+"to the power"+y+"is"+Math.pow(x,y));
	//prints log of the number
	System.out.println("log of the number:"+x+Math.log(x));
	//prints log10 of the number
	System.out.println("log(10) of the number:"+y+"is:"+Math.log10(y));
	
	//return the log of x+1
	 System.out.println("log1p of x is: " +Math.log1p(x));  
	
	 //prints the exponential of a number
	 System.out.println("exp of a is: " +Math.exp(x));    
	 
	 //prints the power of 2-1
	 System.out.println("expm 1 of is:"+Math.expm1(x));
	
	 //creating object to print the time
	LocalDate date=LocalDate.now();
	System.out.println("todays date is:"+date);
	
	//how to get todays date
	//current time-time zone
	//calculate time elapsed between 2 dates or time
	//days of the week
	//months
	
	LocalDate a=LocalDate.of(2022, 12, 17);
	
	LocalDateTime current=LocalDateTime.now();//reads it from operating system
	
	//time elapsed-last seen 53 minutes ago
	LocalTime sooner=LocalTime.of(17, 00);
	LocalTime later=LocalTime.of(19, 00);
	Duration duration =Duration.between(sooner, later);
	System.out.println(duration.toHours());
	
	System.out.println("Bijay");
	}
}
