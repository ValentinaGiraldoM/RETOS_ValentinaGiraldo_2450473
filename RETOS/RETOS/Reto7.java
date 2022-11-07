package RETOS;
import java.util.Scanner;

public class Reto7 
{
    public static void main(String[] args) 
    {
        int cNotas;
        double suma = 0;
        double promedio = 0;

        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Ingresar la cantidad de notas");
        cNotas = Leer.nextInt();

        double[] notas = new double[cNotas];

        for (int i = 0; i < cNotas; i++) 
        {
            System.out.println("Escriba la Nota " + (i +1) );
            notas[i] = Leer.nextDouble();
        }
        for (int j = 0; j < notas.length; j++) 
        {
            suma += notas[j]; 
        }

        for (double d : notas) 
        {
            System.out.println("Sus notas fueron " + d);
        }
          
            promedio = suma / cNotas;
            System.out.println("La nota final es : " + promedio);

        if (promedio < 3.0 ) 
        {
            System.out.println("Reprobaste"); 
        } 
        else if ( promedio <= 4.0 )
        {
            System.out.println("Pasaste Raspando");
        }
        else if ( promedio > 4.0 )
        {
            System.out.println("Aprobaste con buenos resultados");
        }
    }
}
