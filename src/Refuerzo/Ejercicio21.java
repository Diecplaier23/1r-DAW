package Refuerzo;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        int dobleces = 0;
        double grosorMicras, alturaMetros;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el grosor del papel en micras:");
        grosorMicras = sc.nextDouble();
        System.out.println("Introduce la altura del edificio en metros:");
        alturaMetros = sc.nextDouble();
        double grosorMetros = grosorMicras * 0.000001;

        do {
            dobleces++;
            grosorMetros *= 2;
        } while (grosorMetros < alturaMetros);

        System.out.println("El numero de veces que hay que doblar el papel para alcanzar la altura del edificio es: " + dobleces);
    }
}
