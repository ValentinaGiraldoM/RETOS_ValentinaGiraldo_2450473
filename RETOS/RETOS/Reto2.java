package RETOS;
import java.util.Scanner;

public class Reto2 
{
    public static void main(String[] args) throws Exception 
    {
        double peso,meses, dosisVacuna ;
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese el Peso del bebe: ");
        peso = lector.nextDouble();
        System.out.println("Ingrese los Meses del bebe: ");
        meses = lector.nextDouble();

        dosisVacuna = (peso + 10) / (meses * 10) * 8;
        System.out.println("La disis que debe aplicar es: "+ dosisVacuna);
    }
}   
