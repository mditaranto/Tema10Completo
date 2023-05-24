package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {

	 public static int readInt (Scanner sc) {
	        int num = 0;
	        
	        try {
	            System.out.println("Introduzca un valor integer:");
	            num = sc.nextInt();            
	            
	        } catch (InputMismatchException e) {
	            System.err.println("El valor instroducido no es integer");
	            num = 0;
	        }
	        
	        sc.nextLine();
	        return num;
	    }
	    
	    public static double readDouble (Scanner sc) {
	        double num = 0;
	        
	        try {
	            System.out.println("Introduzca un valor double:");
	            num = sc.nextDouble();
	            
	        } catch (InputMismatchException e) {
	            System.err.println("El valor introducido no es double");
	            num = 0.0;
	            
	        }
	        
	        sc.nextLine();
	        return num;
	    }
	    
}
