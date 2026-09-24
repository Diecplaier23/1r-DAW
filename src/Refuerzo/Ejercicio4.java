package Refuerzo;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num= sc.nextInt();

        if (num % 10== 0){
            System.out.println("el numero es multiplo de 10. Dame otro numero");
            num= sc.nextInt();
            if (num % 10== 0){

                System.out.println("el numero tambien es multiplo de 10");
            }else {
                System.out.println("el numero no es multiplo de 10");
            }
        }else {
            System.out.println("el numero no es multiplo de 10");
        }
    }
}
