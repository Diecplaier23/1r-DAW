package Refuerzo;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        int t,min=0,horas=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un tiempo en s, puede ser mayor que 60");
        t = sc.nextInt();
        do {
            if (t-60 >= 0) {
                t= t-60;
                min++;
            }
            if (min-60 >= 0){
                min= min-60;
                horas++;
            }

        }while (t >= 60);
        System.out.println(horas + ":"+min+":"+t);

    }
}
