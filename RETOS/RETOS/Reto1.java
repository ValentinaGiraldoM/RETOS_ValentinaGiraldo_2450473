package RETOS;
import java.util.Scanner;

public class Reto1 
{
    public static void main(String[] args)
    {
        double F,C;
        Scanner lector = new Scanner(System.in);
                
        System.out.println("Ingrese los grados Fahrenheit: ");
        F = lector.nextDouble();
        
        C = (F - 32)/1.8;
        System.out.println(F + "Los grados " + F + "Fahrenheit, son: " + C + "grados Centigrados");
    }
}
