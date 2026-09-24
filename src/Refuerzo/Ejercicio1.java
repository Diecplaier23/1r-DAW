package Refuerzo;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        num = sc.nextInt();

        System.out.println("El doble de tu numero es: "+ num *2 +" y el triple es: " + num *3);
    }
}
