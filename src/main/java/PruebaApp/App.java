package PruebaApp;

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
        String prueba = "Dios Rodi";
        System.out.print("Valores inciales, numero uno: " + numberOne + " numero dos: " + numberTwo + "\n");
        numberTwo = numberOne + numberTwo;
        numberOne = numberTwo - numberOne;
        numberTwo = numberTwo - numberOne; 
        result = "El valor del numero uno es: " + numberOne + " y el valor del numero dos es: " + numberTwo ; 
        return result;
        
    }
            
}