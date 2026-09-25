package Ampliacion;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
    //Declarar variables
        String fecha;
        int dia, mes, año;
    //Pedir fecha de nacimiento al usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa):");
        fecha = sc.nextLine();
    //Sacar el dia de la variable String fecha
        dia= Integer.parseInt(fecha.substring(0,2));
        mes= Integer.parseInt(fecha.substring(3,5));
        año= Integer.parseInt(fecha.substring(6,10));

    //Sacar cada valor de cada una de las variables dia, mes y año
        int d1= Integer.parseInt(fecha.substring(0,2).substring(0,1));
        int d2= Integer.parseInt(fecha.substring(0,2).substring(1,2));

        int m1= Integer.parseInt(fecha.substring(3,5).substring(0,1));
        int m2= Integer.parseInt(fecha.substring(3,5).substring(1,2));

        int a1= Integer.parseInt(fecha.substring(6,10).substring(0,1));
        int a2= Integer.parseInt(fecha.substring(6,10).substring(1,2));
        int a3= Integer.parseInt(fecha.substring(6,10).substring(2,3));
        int a4= Integer.parseInt(fecha.substring(6,10).substring(3,4));

    //Sumar todos los numeros sacados anteriormente y poner el resultado como numero de la suerte
        int n_suerte= d1 + d2 + m1 + m2 + a1 + a2 + a3 + a4;
    //Imprimir el numeo de la suerte por pantalla
        System.out.println(n_suerte);
    }
}