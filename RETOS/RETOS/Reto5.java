package RETOS;
import java.util.Scanner;

public class Reto5
{
    public static void main(String[] args)
    {
        int Cantidad;
        double Precio;
        double Total = 0;

        Scanner Lector = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos que desea comprar: ");
        Cantidad = Lector.nextInt();

        for (int p = 1; p <= Cantidad ; p++) 
        {
            System.out.println("Ingrese el precio del Producto: " + p);
            Precio = Lector.nextDouble();

            Total = Total + Precio;
        }
        System.out.println("El precio total de la compra es : " + Total);
        
        Lector.close();
    }
}
