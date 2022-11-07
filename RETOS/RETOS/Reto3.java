package RETOS;
import java.util.Scanner;
import java.util.Random;

public class Reto3
{
    public static void main(String[] args) 
    {
        int aleatorio;
        int Eleccion;

        Scanner Lector = new Scanner(System.in);
        Random random = new Random();

        System.out.println("CARISELLAZO");
        System.out.println("Escriba el numero 1 si cae Cara o el numero 2 si cae Sello");
        Eleccion = Lector.nextInt();

        System.out.println("La moneda se esta lanzando ");
        aleatorio = (int) (Math.random() *2) + 1;


        if (aleatorio== Eleccion)
        {
            System.out.println("La moneda callo en: ");
            System.out.println(aleatorio);
            System.out.println("Asi que usted Gano");
        }
        else 
        {
            System.out.println("La moneda callo en: ");
            System.out.println(aleatorio);
            System.out.println("Asi que usted Perdio");
        }

        Lector.close();
    }
}
