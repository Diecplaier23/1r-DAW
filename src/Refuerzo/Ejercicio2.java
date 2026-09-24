package Refuerzo;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num= sc.nextInt();

        if (num % 2== 0){
            System.out.println("el numero es par");
        }else {
            System.out.println("el numero es impar");
        }
    }
}
