import java.util.Scanner;

public class Ejercicio15_apartado19 {
    public static void main(String[] args) {
        double euros, pagobruto, salarioneto, impuestos;
        int horas, minutos;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuantas horas has trabajado");
        horas = sc.nextInt();

        System.out.println("Introduce el precio por hora");
        euros = sc.nextDouble();

        if (horas  > 35){
            System.out.println("En las primeras 35h has ganado "+ euros*horas + "€");
            System.out.println("Has ganado " +(horas - 35)*(euros*1.5) + "€ extra por tus "+ (horas -35)+" horas extra");
            pagobruto = euros*horas + (horas-35)*(euros*1.5);
        } else {
            System.out.println("En las primeras 35h has ganado "+ euros*horas + "€");
            pagobruto = euros*horas;
        }

        if (pagobruto <= 500){
            impuestos = 0;
            System.out.println("No pagas impuestos");
            salarioneto = pagobruto - impuestos;
            System.out.println("No pagas impuestos te quedan " + salarioneto);
        }else if (pagobruto <= 900){
            impuestos = (pagobruto -500) *0.25;
            salarioneto = pagobruto - impuestos;
            System.out.println("Has pagado "+ impuestos+ " y te quedan " + salarioneto);
        }else{
            impuestos = 400 *0.25 + (pagobruto - 900) *0.45;
            salarioneto = pagobruto - impuestos;
            System.out.println("Has pagado "+ impuestos+ " y te quedan " + salarioneto);
        }

    }
}
