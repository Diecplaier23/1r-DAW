import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Ejercicio4_apartado7 {
    public static void main(String[] args) {
    //Declaracion de varables
        double precioreal;
        double preciorebaja;
    //Scaner de los numeos del usuario
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el recio real: ");
        precioreal = sc.nextFloat();

        System.out.println("Introduce precio rebajado: ");
        preciorebaja = sc.nextFloat();
        sc.close();
    //Operacion
        double descuento = (precioreal- preciorebaja)/precioreal * 100;
    //Mostrar el resultado final
        System.out.println("El descuetnto es de: " + descuento);
    }
}
