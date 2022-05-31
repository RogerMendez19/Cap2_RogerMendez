/*Escriba un programa que reciba cinco números, y que determine e imprima la cantidad de números 
negativos, positivos, y la cantidad de ceros recibidos.*/
import java.util.Scanner;
public class Ejercicio232
{
    public static void main(String[]args)
    {
        int num1,num2,num3,num4,num5;
        int neg=0;
        int pos=0;
        int nulo=0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba el primer numero: ");
        num1= entrada.nextInt();
        System.out.print("Escriba el segundo numero: ");
        num2= entrada.nextInt();
        System.out.print("Escriba el tercer numero: ");
        num3= entrada.nextInt();
        System.out.print("Escriba el cuarto numero: ");
        num4= entrada.nextInt();
        System.out.print("Escriba el quinto numero: ");
        num5= entrada.nextInt();

        if(num1<0)
        {
            neg++;
        }
        else if(num1>0)
        {
            pos++;
        }
        else
        {
            nulo++;
        }
        if(num2<0)
        {
            neg++;
        }
        else if(num2>0)
        {
            pos++;
        }
        else
        {
            nulo++;
        }
        if(num3<0)
        {
            neg++;
        }
        else if(num3>0)
        {
            pos++;
        }
        else
        {
            nulo++;
        }
        if(num4<0)
        {
            neg++;
        }
        else if(num4>0)
        {
            pos++;
        }
        else
        {
            nulo++;
        }
        if(num5<0)
        {
            neg++;
        }
        else if(num5>0)
        {
            pos++;
        }
        else
        {
            nulo++;
        }

        System.out.println("El total de negativos es: "+neg);
        System.out.println("El total de positivos es: "+pos);
        System.out.println("el total de nulos es: "+nulo);
    }
}