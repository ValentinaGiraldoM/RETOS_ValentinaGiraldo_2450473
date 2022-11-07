package RETOS;
import java.util.Scanner;

public class Reto9 
{
    public static void main(String[] args) 
    {
        Scanner Leer = new Scanner(System.in);
        
        String pNombre [] [] = new String [4][4];
        Double pPrecio [] [] = new Double [4][4];

        for (int f = 0; f < pNombre.length; f++) 
        {
            for (int c = 0; c < pPrecio.length; c++) 
            {
                System.out.println("Ingrese el nombre del producto [" + f + "][" + c + "]");
                pNombre[f][c]= Leer.next();
                System.out.println("ingrese el precio del producto ");
                pPrecio[f][c] = Leer.nextDouble();
                System.out.println("***********************************");
            }
        }

        for (int f = 0; f < pNombre.length; f++) 
        {
            for (int c = 0; c < pPrecio.length; c++)
            {
                System.out.println("El nombre del producto [" + f + "][" + c + "] es: " + pNombre [f][c]);
                System.out.println("y su precio es: " + pPrecio [f][c] );
                System.out.println("***********************************");
            }
        }
    }
}
