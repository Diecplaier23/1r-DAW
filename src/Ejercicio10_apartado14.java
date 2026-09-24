import java.util.Scanner;

public class Ejercicio10_apartado14 {
    public static void main(String[] args) {
    //declarar variables
        int nota;

    //pedir nota
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una nota:");
        nota = sc.nextInt();

        if (nota < 3){
            System.out.println("Muy Deficiente");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 6) {
            System.out.println("Suficiente");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        }else{
            System.out.println("Sobresaliente");
        }

    }
}
