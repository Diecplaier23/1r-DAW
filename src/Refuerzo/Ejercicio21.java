package Refuerzo;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        int metros, dobleces=0;
        float micras;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el grosor del papel en micras:");
        micras = sc.nextFloat();
        System.out.println("Introduce la altura del edificio en metros:");
        metros = sc.nextInt();
        do{
            dobleces++;
            micras*=2;
        }while (micras < metros);
        System.out.println("El numero de veces que hay que doblar el papel para alcanzar la altura del edificio es: " + dobleces);

    }
}
