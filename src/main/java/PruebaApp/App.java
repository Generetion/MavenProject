package PruebaApp;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Hello world!
 *
 */
public class App 
{
     public static void main( String[] args )
    {
        System.out.println(App.SwichtNumbers(10, 0x33));
    }
    public static String SwichtNumbers(int numberOne, int numberTwo)
    {   
        String result;
        System.out.print("Valores inciales, numero uno: " + numberOne + " numero dos: " + numberTwo + "\n");
        numberTwo = numberOne + numberTwo;
        numberOne = numberTwo - numberOne;
        numberTwo = numberTwo - numberOne; 
        result = "El valor del numero uno es: " + numberOne + " y el valor del numero dos es: " + numberTwo ; 
        return result;
        
    }
    
    public static void abc(){
        AtomicInteger aInt1 = new AtomicInteger(0);
        AtomicInteger aInt2 = new AtomicInteger(0);

        if (aInt1.equals(aInt2)) { 
        
        }  // Noncompliant
    }
            
}