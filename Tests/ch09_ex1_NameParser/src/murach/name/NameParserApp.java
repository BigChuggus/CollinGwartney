package murach.name;

import java.util.Scanner;
import murach.name.Interface;
public class NameParserApp {

    public static void main(String[] args) {
    	new Interface();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();
        
        
        name = name.trim();
        
        int startSpace = name.indexOf(" ");
        int endSpace = name.lastIndexOf(" ");
        String firstName = "";
        String middleName = "";
        String lastName = "";
       
        if (startSpace >= 0)
        {
           firstName = name.substring(0, startSpace);
           if (endSpace > startSpace)
               middleName = name.substring(startSpace + 1, endSpace);
               lastName = name.substring(endSpace + 1, name.length());

        }
        
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        
        sc.close();
        
    }
}
