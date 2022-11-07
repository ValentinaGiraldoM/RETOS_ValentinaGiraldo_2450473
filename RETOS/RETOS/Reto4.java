package RETOS;
import java.util.Scanner;
import java.util.Random;

public class Reto4 
{
    public static void main (String[] args)
    {
        int Eleccion;
        int aleatorio;

        Scanner Lector = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Escriba 1 para PIEDRA, 2 para PAPEL o 3 para TIJERA ");
        Eleccion = Lector.nextInt();

        System.out.println("El sistema esta elijiendo ");
        aleatorio = (int) (Math.random() *3) + 1;

       
        if (aleatorio == 1 )
        {
            if(aleatorio == 1 && Eleccion==1 )
            {
                System.out.println("Salio PIEDRA por lo tanto es EMPATE");
            }
            else if (aleatorio == 1 && Eleccion == 2)
            {
                System.out.println(" Salio PIEDRA por lo tanto GANO");
            }
            else if (aleatorio == 1 && Eleccion == 3)
            {
                System.out.println(" Salio PIEDRA por lo tanto PERDIO");
            }
        }
        
        else if (aleatorio==2 )
        {
            if(aleatorio == 2 && Eleccion==2 )
            {
                System.out.println("Salio PAPEL por lo tanto es EMPATE");
            }
            else if (aleatorio == 2 && Eleccion == 3)
            {
                System.out.println(" Salio PAPEL por lo tanto GANO");
            }
            else if (aleatorio == 2 && Eleccion == 1)
            {
                System.out.println(" Salio PAPEL por lo tanto PERDIO");
            }
        }
        else if (aleatorio==3 )
        {
            if(aleatorio == 3 && Eleccion == 3 )
            {
                System.out.println("Salio TIJERA por lo tanto es EMPATE");
            }
            else if (aleatorio == 3 && Eleccion == 1)
            {
                System.out.println(" Salio TIJERA por lo tanto GANO");
            }
            else if (aleatorio == 3 && Eleccion == 2)
            {
                System.out.println(" Salio TIJERA por lo tanto PERDIO");
            }
        }
    }
}
