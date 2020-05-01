package murach.name;

import murach.name.Interface;
import javax.swing.JFrame;

import java.awt.Component;
import java.awt.event.WindowEvent;
import java.util.Scanner;

import javax.swing.*;  
public class Interface extends NameParserApp {

	JFrame f;

		Interface(){  
		    f=new JFrame();   
		    String name=JOptionPane.showInputDialog(f,"Enter Full Name"); 
		    // System.out.println(name);
		    windowClosing(name);
		}  
		public static void main(String[] args) {  
		    new Interface();  
		    
		    
		    
		}  
		  
		public void windowClosing(String InputName) {  
		  //  int a=JOptionPane.showConfirmDialog(f,"Are you sure?");  
		// if(a==JOptionPane.YES_OPTION) {  
		//    Scanner sc = new Scanner(System.in);

	   //     System.out.print("Enter your full name: ");
	   //     String name = sc.nextLine();
	        
	        
	        String name = InputName.trim();
	        
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
	     //   Component g;
	     //   g = new Component();
	       JOptionPane.showMessageDialog(null, 
	        		"First Name: " + firstName + "\n" + 
	        		"Middle Name: " + middleName + "\n" + 
	        		"Last Name: " + lastName, "Name Parser", JOptionPane.PLAIN_MESSAGE);
	        		// JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE
	        		
	      //  System.out.println("First Name: " + firstName);
	      //  System.out.println("Middle Name: " + middleName);
	      //  System.out.println("Last Name: " + lastName);
		// }  
		}

}


	
