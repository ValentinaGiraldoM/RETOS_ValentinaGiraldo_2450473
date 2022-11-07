package RETOS;
import java.util.Scanner;

public class Reto6 
{
    public static void main(String[] args) 
    {
        int Eleccion;
        int aleatorio;
        int Apuesta;
        int Acumulado = 0;
        int Continuar;

        Scanner lector = new Scanner(System.in);

        do {
            System.out.println("Escriba cuanto desea apostar: ");
            Apuesta = lector.nextInt();

            System.out.println("Escriba el numero 1 si cae Cara o el numero 2 si cae Sello");
            Eleccion = lector.nextInt();

            System.out.println("La moneda se esta lanzando ");
            aleatorio = (int) (Math.random() *2) + 1;

            if (aleatorio== Eleccion)
            {
                System.out.println("La moneda callo en: ");
                System.out.println(aleatorio);
                System.out.println("Asi que usted Gano");

                Acumulado = Acumulado+(Apuesta*2);
            }
            else 
            {
                System.out.println("La moneda callo en: ");
                System.out.println(aleatorio);
                System.out.println("Asi que usted Perdio");
                Acumulado = Acumulado - Apuesta;
            }
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            System.out.println("El dinero que acumulo es de: " + Acumulado);
            System.out.println("\nEscriba el numero 0 si desea continuar o cualquier numero para salir ");
            Continuar= lector.nextInt();
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        } while (Continuar==0);
    }
}
