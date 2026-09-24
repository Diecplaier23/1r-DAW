import java.util.Scanner;

public class Ejercicio6_apartado10 {
    public static void main(String[] args) {
    //Declaar variables
        double numero;
    //Pedir numero real
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numeroreal:");
        numero =sc.nextDouble();
    //Comprar con 0
        if (numero >0){
    //Responder si es mayor o menor
            System.out.println("Este " + numero + " es positivo");
        }else {
            System.out.println("El" + numero + " es negativo");
        }
    }
}
