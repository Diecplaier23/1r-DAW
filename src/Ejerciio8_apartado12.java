import java.util.Scanner;

public class Ejerciio8_apartado12 {
    public static void main(String[] args) {
    //Declarar variables
        double numero1, numero2;
    //Pedir numeros
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        numero1 = sc.nextDouble();

        System.out.println("Introduce el segundo numero:");
        numero2 = sc.nextDouble();
    //Comparar numeros
        if (numero1 > numero2){
    //Mostrar en pantalla que numero es más grande
            System.out.println("El numero más grande es: "+ numero1);
        } else {
            System.out.println("El numero más grande es: "+numero2);
        }
    }
}
