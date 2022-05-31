import java.util.Scanner;
public class Multiplos
{
    public static void main(String[] args)
    {
        Scanner entrada= new Scanner(System.in);
        int num1,num2,resultado;
        
        System.out.print("Ingrese el primer numero: ");
        num1=entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2=entrada.nextInt();

        resultado= num1*num2;

        if (num1 % num2 ==0)
        {
            System.out.println("El numero: "+num2+", es multiplo de: "+num1);
            System.out.println("el resultado es: "+resultado);
        }
        else
        {
            System.out.println("El numero: "+num2+", no es multiplo de: "+num1);
        }
    }
}