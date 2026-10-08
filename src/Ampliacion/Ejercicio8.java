package Ampliacion;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int mi_piscina,mi_cubo,mi_perdida;
        int vecino_piscina,vecino_cubo,vecino_perdida;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de litros que le caben a la piscina como maximo:");
         mi_piscina= sc.nextInt();
        System.out.println("Introduce el numero de litros que le caben en el cubo como maximo:");
        mi_cubo = sc.nextInt();
        System.out.println("Introduce el numero de litros que se pierden:");
        mi_perdida = sc.nextInt();
        System.out.println("Introduce el numero de litros que le caben a la piscina del vecino como maximo:");
        vecino_piscina = sc.nextInt();
        System.out.println("Introduce el numero de litros que le caben en el cubo del vecino como maximo:");
        vecino_cubo = sc.nextInt();
        System.out.println("Introduce el numero de litros que se pierden en la piscina del vecino:");
        vecino_perdida = sc.nextInt();

        int mi_viaje = mi_piscina/mi_cubo-mi_perdida;
        int v_viaje = vecino_piscina/vecino_cubo-vecino_perdida;

        if (mi_viaje>v_viaje){
            System.out.println("1");
        } else if (mi_viaje<v_viaje){
            System.out.println("-1");
        } else {
            System.out.println("0");
        }

    }
}
