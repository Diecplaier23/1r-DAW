import java.util.Scanner;

public class Ejercicio3_subapartado20 {
    public static void main(String[] args) {
        float lado1, lado2, lado3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tres lados");
        lado1 = sc.nextFloat();
        lado2 = sc.nextFloat();
        lado3 = sc.nextFloat();
        System.out.println(lado1 + lado2 + lado3);

        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado3 + lado2 > lado1)){

            System.out.println("Triangulo");
            if (lado1 == lado2 && lado2 == lado3) {

                System.out.println("El triangulo es equilatero");

            } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {

                System.out.println("El riangulo es isosceles");

            }else {
                System.out.println("El triangulo es equilatero");
            }

        }else {
            System.out.println("No puede existir");
        }
    }
}
