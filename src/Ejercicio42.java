import java.util.Scanner;


public class Ejercicio42 {
    public static void main(String[] args) {
        int num,iteraciones = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para comprobar si es un numero de Armstrong:");
        num = sc.nextInt();
        do {
            if (num%2 == 0) {
                num = (num/2);
            } else {
                num = (num*3)+1;
            }
            iteraciones++;
        }while (num != 1);
        System.out.println("El numero de iteraciones es: " + iteraciones);

    }
}
