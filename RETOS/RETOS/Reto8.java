package RETOS;
import java.util.Scanner;

public class Reto8
{
    public static void main(String[] args) 
    {
        int Cantidad = 0;
        double mTiempo;
        
        Scanner Leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de competidores: ");
        Cantidad = Leer.nextInt();

        String [] nombre = new String [Cantidad];
        Double [] tiempo = new Double [Cantidad];

        for (int i = 0; i < Cantidad; i ++)
        {
            System.out.println("Ingrese el nombre del competidor " + (i + 1));
            nombre[i] = Leer.next();

            System.out.println("Ingrese el tiempo del competidor " + nombre[i]);
            tiempo[i] = Leer.nextDouble();
        }

        mTiempo = tiempo[0];

       for (int m = 1; m < Cantidad; m++) 
       {
            if (tiempo[m] < mTiempo) 
            {
                mTiempo = tiempo[m];
            } 
       }

       for (int v = 0; v < Cantidad; v++) 
       {
            System.out.println("Nombre del competidor: " + nombre[v] + "\n Tiempo: " + tiempo[v]);
            if (tiempo[v].equals(mTiempo)) 
            {
                System.out.println("Este competidor fue el que gano !FELICITACIONES¡");
            }
       }
    }
}
