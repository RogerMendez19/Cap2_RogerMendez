/*Escriba una aplicación que reciba del usuario el radio de un círculo como un entero, y que imprima
el diámetro, la circunferencia y el área del círculo mediante el uso del valor de punto flotante 3.14159 para π.*/
import java.util.Scanner;
public class Circulo
{
    public static void main(String[]args)
    {
        int radio;
        double dia,cir,area;
    
        Scanner entrada= new Scanner(System.in);
        System.out.print("Ingrese el radio del circulo:");
        radio= entrada.nextInt();

        dia= 2*radio;
        cir= 2*radio*(3.14159);
        area= radio*radio*(3.14159);

        System.out.println("El diametro del circulo es: "+dia);
        System.out.println("La circuferencia del circulo es: "+cir);
        System.out.println("El área del circulo es: "+area);
    }
}