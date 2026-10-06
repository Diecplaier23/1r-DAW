package Ampliacion;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int soldados;
        System.out.println("Introduce el numero de soldados:");
        Scanner sc = new Scanner(System.in);
        soldados = sc.nextInt();
        System.out.println("Se necesitan " + cuantosEscudos(soldados) + " escudos.");
    }
    public static int cuantosEscudos(int soldados) {
        if (soldados < 0) {
            throw new IllegalArgumentException("El numero de soldados no puede ser negativo.");
        }
        int restantes = soldados;
        int escudos = 0;

        while (restantes > 0) {
            int lado = (int) Math.sqrt(restantes);
            while (lado + 1 <= restantes / (lado + 1)) {
                lado++;
            }
            while (lado > restantes / lado) {
                lado--;
            }

            int legionarios = lado * lado;
            escudos += legionarios + 4 * lado;
            restantes -= legionarios;
        }

        return escudos;
    }
}
