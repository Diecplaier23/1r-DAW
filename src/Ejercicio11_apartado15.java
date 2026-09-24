import java.util.Scanner;

public class Ejercicio11_apartado15 {
    public static void main(String[] args) {
    //Declarar variales
        int numero;
    //Pedir numero
        Scanner sc =new Scanner(System.in);
        System.out.println("Introduce un numero:");
        numero = sc.nextInt();
    //Switch
        switch (numero) {
            case 0:
                System.out.println("CERO");
                break;
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("CUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SIETE");
                break;
            case 8:
                System.out.println("OCHO");
                break;
            case 9:
                System.out.println("NUEVE");
                break;
            case 10:
                System.out.println("DIEZ");
                break;
        }

    }
}
