import java.util.Scanner;
public class MenorMayor
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        float num1,num2,num3,mayor,menor,prod,sum;
        double prom;

        System.out.print("Ingrese el primer numero: ");
        num1= entrada.nextFloat();

        System.out.print("Ingrese el segundo numero: ");
        num2= entrada.nextFloat();

        System.out.print("ingrese el terce numero: ");
        num3= entrada.nextFloat();

        if (num1==num2 && num2==num3){
            System.out.println("los tres numeros son iguales");
        } else if (num1 > num2 && num1 > num3){
             System.out.println("El mayor numero es: "+num1);
        }else if (num2 > num1 && num2 > num3){
             System.out.println("El mayor numero es: "+num2);
        }else {
            System.out.println("El mayor numero es: "+num3);
        }    
        if (num1==num2 && num2==num3){
            System.out.println("los tres numeros son iguales");
        } else if (num1 < num2 && num1 < num3){
             System.out.println("El menor numero es: "+num1);
        }else if (num2 < num1 && num2 < num3){
             System.out.println("El menor numero es: "+num2);
        }else {
            System.out.println("El menor numero es: "+num3);
        }
        sum = num1+num2+num3;
        prod = num1*num2*num3;
        prom = (num1+num2+num3)/3;
        prom= Math.round(prom);

        System.out.println("La suma de los 3 numeros es: "+sum);
        System.out.println("El producto de los 3 numeros es: "+prod);
        System.out.println("el promedio de los 3 numeros es: "+prom);

    }
}