/*Use Web para determinar la población mundial actual y la tasa de crecimiento anual 
de la población mundial. Escriba una aplicación que reciba estos valores como entrada y 
luego muestre la población mundial estimada después de uno, dos, tres, cuatro y cinco años.*/
import java.util.Scanner;
public class Poblacion
{
    public static void main(String[]args)
    {
        double poblacion=LeerDatoDoubleDeConsola("Digitar el dato de la poblacion mundial: ");
    double incremento=LeerDatoDoubleDeConsola("Digitar el porcentaje de incremento de la poblacion: ");

    double a2023=poblacion*((incremento/100)+1);
    System.out.println("La poblacion mundial en el año 2023 sera de: "+a2023);

    double a2024=a2023*((incremento/100)+1);
    System.out.println("La poblacion mundial en el año 2024 sera de: "+a2024);

    double a2025=a2024*((incremento/100)+1);
    System.out.println("La poblacion mundial en el año 2025 sera de: "+a2025);

    double a2026=a2025*((incremento/100)+1);
    System.out.println("La poblacion mundial en el año 2026 sera de: "+a2026);

    double a2027=a2026*((incremento/100)+1);
    System.out.println("La poblacion mundial en el año 2024 sera de: "+a2027);
    }
    public static double LeerDatoDoubleDeConsola(String mensaje){
        double numero1=0;
        Scanner entrada = new Scanner(System.in);
        System.out.print(mensaje);
        numero1=entrada.nextDouble();
        return numero1;
    }
}    