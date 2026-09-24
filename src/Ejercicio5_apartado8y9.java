import java.util.Scanner;

public class Ejercicio5_apartado8y9 {
    public static void main(String[] args) {
    //Declarar variables
        int edad;
    //Pedir edad
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        edad= sc.nextInt();
    //If: Comparar la variable con un numero fijo
        if (edad >=18){
    //Responder tanto si es mayor como menor de edad
            System.out.println("Eres mayor de edad");
    //Descomentar estas lineas para hacer practica 9
        /*}else{
            System.out.println("Eres menor de edad");*/
        }
    }
}
