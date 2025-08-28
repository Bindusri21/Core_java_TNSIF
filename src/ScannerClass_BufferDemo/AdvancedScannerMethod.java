package ScannerClass_BufferDemo;

import java.util.Scanner;

public class AdvancedScannerMethod {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some data (you can enter numbers or text):");

        while (scan.hasNext()) {  
        	
            if (scan.hasNextInt()) 
            {  // Check if the next token is an integer
                int intValue = scan.nextInt();
                System.out.println("Read an integer: " + intValue);
                scan.nextLine();  // Consume the leftover newline
            } 
            
            else if (scan.hasNextDouble()) {  // Check if the next token is a double
                double doubleValue = scan.nextDouble();
                System.out.println("Read a double: " + doubleValue);
                scan.nextLine();  // Consume the leftover newline
            } 
            
            else {  // Handle any other input
                String stringValue = scan.next();  // Read the next token as a string
                System.out.println("Unknown input: " + stringValue);
            }
        }
        
        scan.close();
    }
}