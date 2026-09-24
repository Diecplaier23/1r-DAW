package Refuerzo;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        num= sc.nextInt();

        if (num % 2== 0 && num% 3!=0){
            System.out.println("el numero es multiplo de 2 pero no de 3");

        }
        else {
            System.out.println("el numero es multilo de 2 y de 3");
        }
    }
}
