/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author BED
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc  = new  Scanner(System.in);
		System.out.println("Student Information");System.out.println("");
		
//ask and read your name.Output should look like this Enter your name: Reyniel C. Seda
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		//ask and read your age.The output should look like this Enter your age: 19
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		//ask and read your course.The output should look like this Enter your Course: BSIT 
		System.out.print("Enter your Course: ");
		String Course = sc.nextLine();
		
		//ask and read your year level.The output should look like this Enter year level: 1
		System.out.print("Enter  Year  level: ");
		String Yearlevel= sc.nextLine();
		
		//ask and read your favorite Qoute.
		//the output should look like this Enter your Qoute: "The future belongs to those who believe in the beauty of their dreams."
	System.out.print("Enter your Favorite Qoute: ");
		String Qoute = sc.nextLine();
		
		//it computes birth year using age
		int birthday = 2025 - age ;
		 
		 //print Student Information
	 System.out.println("");
	System.out.println("Student Information");        System.out.println("");
	System.out.println("Name: " + name.toUpperCase());
	System.out.println("Age: " + age);
	System.out.println("Birthday: " + birthday);
	System.out.println("Course: " + Course);
System.out.println("Year level: " + Yearlevel);
System.out.println("Favorite Qoute: " + Qoute);
		//close Scanner to free resources
		sc.close();
    }
    
}
