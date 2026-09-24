package Refuerzo;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe 2 numeros");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1==num2) {
            System.out.println("Los numeros son iguales");
        }else {
            if(num1<num2){
                System.out.println(num2);
            }else{
                System.out.println(num1);
            }
        }
    }
}
