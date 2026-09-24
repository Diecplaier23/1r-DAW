import java.util.Scanner;

public class Ejercicio13_apartado17 {
    public static void main(String[] args) {
        int mes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero del mes");
        mes = sc.nextInt();

        switch (mes){
            case 2:
                System.out.println("El mes tiene 28 dias");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes tiene 31 dias");
                break;
            default:
                System.out.println("El mes tiene 30 dias");

        }

    }
}
