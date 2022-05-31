import java.util.Scanner;
public class Enteros
{
    public static void main(String[]args)
    {
        Scanner entero=new Scanner(System.in);
        int n1,n2,n3,n4,n5,menor,mayor;

        System.out.print("ingrese el primer numero: ");
        n1 = entero.nextInt();
        System.out.print("ingrese el segundo numero: ");
        n2 = entero.nextInt();
        System.out.print("ingrese el tercer numero: ");
        n3 = entero.nextInt();
        System.out.print("ingrese el cuarto numero: ");
        n4 = entero.nextInt();
        System.out.print("ingrese el quinto numero: ");
        n5 = entero.nextInt();
        
        if (n1>n2 && n1>n3 && n1>n4 && n1>n5)
        {
            System.out.println("El numero mayor es: "+n1);
        }
        else if (n2>n1 && n2>n3 && n2>n4 && n2>n5)
        {
            System.out.println("El numero mayor es: "+n2);
        }
        else if (n3>n1 && n3>n2 && n3>n4 && n3>n5)
        {
            System.out.println("El numero mayor es: "+n3);
        }
        else if (n4>n1 && n4>n2 && n4>n3 && n4>n5)
        {
            System.out.println("El numero mayor es: "+n4);
        }
        else 
        {
            System.out.println("El numero mayor es: "+n5);
        }

        if (n1<n2 && n1<n3 && n1<n4 && n1<n5)
        {
            System.out.println("El numero menor es: "+n1);
        }
        else if (n2<n1 && n2<n3 && n2<n4 && n2<n5)
        {
            System.out.println("El numero menor es: "+n2);
        }
        else if (n3<n1 && n3<n2 && n3<n4 && n3<n5)
        {
            System.out.println("El numero menor es: "+n3);
        }
        else if (n4<n1 && n4<n2 && n4<n3 && n4<n5)
        {
            System.out.println("El numero menor es: "+n4);
        }
        else 
        {
            System.out.println("El numero menor es: "+n5);
        }
    }
}