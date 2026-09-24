import org.w3c.dom.css.Counter;

import java.util.Scanner;

public class Ejercicio18_apartado22 {
    public static void main(String[] args) {
        int contador =0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe un numero");
            int num = sc.nextInt();


            if (num >= 0){
                contador ++;
            }
        }
        System.out.println("El numero de positivos totales es de " + contador);

    }
}
