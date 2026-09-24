import java.util.Scanner;

public class Ejercicio3_apartado6 {
    public static void main(String[] args) {
    //Declarar variables
        double radio;
    //Pedir al usuario el radio
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio:");
        radio = sc.nextDouble();
        sc.close();

    //Operacion de perimetro y radio
        double perimetro = radio * Math.PI*2;
        double area = radio * radio * Math.PI;

    //Mostrar el resultado en pantalla
        System.out.println("El area es: " +area);
        System.out.println("El perimetro es: " +perimetro);
    }
}
