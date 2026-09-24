import java.util.Scanner;

public class Ejercicio9_apartado13 {
    public static void main(String[] args) {

    //declarar variables
        double numero1, numero2;
        String orden;

    //Pedir numeros
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer numero:");
        numero1 = sc.nextDouble();

        System.out.println("Dime el segundo numero:");
        numero2 = sc.nextDouble();

    //Pedir orden
        Scanner text = new Scanner(System.in);
        System.out.println("Orden ascendente o descendente?:");
        orden = text.nextLine();

    //comparar texto con tipo posibles
        if (orden.equals("ascendente")){
            if (numero1< numero2){
                System.out.println(numero1+" "+ numero2);
            }
        } else if (orden.equals("descendente")) {
            if (numero1> numero2){
                System.out.println(numero1+" "+ numero2);
            }
        } else {
            System.out.println("escribe asscendete o descendente");
        }
    }
}
