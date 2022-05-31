import java.util.Scanner;
public class Ejercicio28
{
    public static void main(String[] args)
    {
        int a, b, c;
        Scanner ent = new Scanner(System.in);

        System.out.print("Escriba un entero: ");
        b= ent.nextInt();
        System.out.print("Escriba otro entero: ");
        c= ent.nextInt();
        a= b*c;

        System.out.println("El producto es: "+a);
        
    }
}