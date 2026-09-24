package Refuerzo;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        int num1,pares=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe 1 numeros");
        num1 = sc.nextInt();
        do {
            if (num1 % 2 == 0){
                pares++;
                System.out.println(num1);
                num1+=2;

            }else{
                num1++;
                pares++;
                System.out.println(num1);
                num1+=2;


            }
        }while (pares < 5);


    }
}
