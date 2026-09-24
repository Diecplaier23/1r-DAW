package Refuerzo;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe 1 numeros");
        num1 = sc.nextInt();
        num2 = num1;
        for (int i = 1; i < 10; i= i+2) {
            System.out.println(num2*i );

            if (num1 % 2== 0){
                System.out.println(num2*i );
            }else {
                num1;
                System.out.println(num2*i );
            }
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Escribe 1 numeros");
            num1 = sc1.nextInt();

        }
    }
}
