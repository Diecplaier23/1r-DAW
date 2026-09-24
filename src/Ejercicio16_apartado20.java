import java.util.Scanner;

public class Ejercicio16_apartado20 {
    public static void main(String[] args) {
        int precio;

        Scanner sc = new Scanner(System.in);
        System.out.println("El precio del producto");
        precio = sc.nextInt();

        if (precio >= 6 && precio <=60) {
            System.out.println("Tienes un descuento del 5% " + (precio-(precio * 0.05)));
        } else if (precio >= 60) {
            System.out.println("Tienes un descuento del 10% " + (precio-(precio * 0.1)));

        }else {
            System.out.println("No tienes descuento");
        }
    }
}
