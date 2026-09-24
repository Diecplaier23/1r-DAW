package Refuerzo;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        num= sc.nextInt();

        if (num % 2!= 0 && num% 3!=0){
            System.out.println("el numero no  es multilo de 2 ni de 3");

        }
        else {
            System.out.println("el numero es multiplo de 2 o de 3");
        }
    }
}
