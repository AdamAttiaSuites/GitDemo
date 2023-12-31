package GitTrial.GitTrial;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("My name is Adam Attia");
        
        getName();
    }
    public static void getName() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter the nAme: ");
    	
    	String nameString = scanner.nextLine();
    	System.out.println("The name was enetered is : " + nameString);
    }
}
