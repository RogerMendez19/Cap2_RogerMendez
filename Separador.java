/*Escriba una aplicación que reciba del usuario un número compuesto por cinco dígitos, 
que separe ese número en sus dígitos individuales y los imprima, cada uno separado de los demás 
por tres espacios*/

import java.util.Scanner;
public class Separador
{
    public static void main(String[]args)
    {
        int numero1=0;
        int digito1= 0;
        int digito2= 0;
        int digito3= 0;
        int digito4= 0;
        int digito5= 0;

        int division1=0;
        int division2=0;
        int division3=0;
        int division4=0;
        int division5=0;

        numero1=LeerDatoEnteroDeConsola();

        division1=numero1/10;
        digito1=numero1%10;

        division2= division1/10;
        digito2= division1%10;

        division3= division2/10;
        digito3= division2%10;

        division4= division3/10;
        digito4= division3%10;

        division5= division4/10;
        digito5= division4%10;

        System.out.printf("Los digitos separados son:%d   %d   %d   %d   %d ",digito5,digito4,digito3,digito2,digito1);
    }
    public static int LeerDatoEnteroDeConsola(){
        int numero1=0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite el numero ");
        numero1=entrada.nextInt();
        return numero1;
    }
}
