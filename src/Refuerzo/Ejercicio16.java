package Refuerzo;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe 3 numeros");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1>num2 && num2>num3){
            System.out.println( "El numero mas grande es:"+num1);

        } else if (num3>num2 && num2>num1) {
            System.out.println("El numero mas grande es:"+ num3);
        }else {
            System.out.println("El numero mas grande es:" +num2);
        }
    }
}
