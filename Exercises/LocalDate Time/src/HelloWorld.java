import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {

	public static void main(String args[]) {
		
		LocalDateTime localDate = LocalDateTime.now();
		System.out.println(localDate);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, YYYY h:mm a");
		System.out.println(dtf.format(localDate)); 
		
	}

}
