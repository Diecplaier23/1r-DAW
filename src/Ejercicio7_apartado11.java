import java.util.Scanner;

public class Ejercicio7_apartado11 {
    public static void main(String[] args) {
//Declarar variables
        double numero1, numero2;
//Pedir numeros
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer numero: ");
        numero1 = sc.nextDouble();

        System.out.println("Dime el segundo numero: ");
        numero2 = sc.nextDouble();
//Comprar
        if (numero1 < numero2){
//Mostrar comparacion
            System.out.println("El "+ numero2+ " es mayor que "+ numero1);
        }else{
            System.out.println("El "+numero1+" es mayor que "+numero2);
        }


    }
}
