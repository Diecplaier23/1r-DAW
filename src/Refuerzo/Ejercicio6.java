package Refuerzo;

import javax.xml.transform.sax.SAXSource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intrdoduce un primer numero");
        num1 = sc.nextInt();
        System.out.println("Intrdoduce el segundo numero");
        num2 = sc.nextInt();
        if (num2 ==0){
            System.out.println("Error no se pude dividir entre 0");
        }else {
            System.out.println("El resultado es "+ (num1 / num2));
        }
    }
}
