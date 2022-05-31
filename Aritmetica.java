import java.util.Scanner;
public class Aritmetica
{
    public static void main(String[] args)
    {
         Scanner obj = new Scanner(System.in);
        float num1,num2,suma,resta,multi,div;

        System.out.print("Ingrese el primer numero: ");
        num1= obj.nextFloat();

        System.out.print("Infrese el segundo numero: ");
        num2= obj.nextFloat();

        suma= num1+num2;
        resta= num1-num2;
        multi= num1*num2;
        div= num1/num2;
        
        System.out.println("El resultado de la suma es: " +suma);
        System.out.println("El resultado de la resta es: " +resta);
        System.out.println("El resultado de la multiplicacion es: " +multi);
        System.out.println("El resultado de la división es: " +div);

    } 
}