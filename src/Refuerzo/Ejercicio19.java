package Refuerzo;

import org.w3c.dom.html.HTMLImageElement;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        int dist, vmax, tmpo, v;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la distancia recorrida en metros:");
        dist = sc.nextInt();
        System.out.println("Introduce la velocidad permitida en hm/h:");
        vmax = sc.nextInt();
        System.out.println("Introduce el tiempo empleado en segundos:");
        tmpo = sc.nextInt();
        vmax/=100;//pasa a m/s
        v = dist/tmpo;
        if (v > vmax){
            System.out.println("Puntos");
        } else if (v - vmax < 0.20 * vmax) {
            System.out.println("Mal");
        } else {
            System.out.println("Ok");
        }
    }
}