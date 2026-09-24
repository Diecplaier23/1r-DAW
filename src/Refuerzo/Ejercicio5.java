package Refuerzo;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intrdoduce un primer numero");
        num1 = sc.nextInt();

        if (num1 == 0){
            System.out.println("Cualquier numero multiplicado por 0 es 0");
        }else {
            System.out.println("Intrdoduce el segundo numero");
            num2 = sc.nextInt();

            System.out.println("El producto es " + (num1*num2));
        }
    }
}
