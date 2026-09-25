package Ampliacion;

import java.util.Scanner;

/*
assertEquals(amstrong.armstrong(370), true);
assertEquals(amstrong.armstrong(371), true);
assertEquals(amstrong.armstrong(407), true);
assertEquals(amstrong.armstrong(698), false);
*/
public class Ejercicio2 {
    public static void main(String[] args) {
    //Declarar variables
        int num, n_cifras, cifra=0, resultado=0;
    //Pedir numero al usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para comprobar si es un numero de Armstrong:");
        num = sc.nextInt();
    //Cuenta el numero de cifras

        n_cifras = String.valueOf(num).length();


    //Cuenta cada cifra y la eleva


        for (int i = 0; i < n_cifras; i++) {
            cifra= Integer.parseInt(String.valueOf(num).substring(i, i + 1));

            resultado += (int) Math.pow(cifra, n_cifras); // Eleva cifra al numero de cifras

        }
        if (resultado == num) {
            System.out.println(num + " Es un numero de Armstrong");
        } else {
            System.out.println(num + " no es un numero de Armstrong");
        }
    }
}
