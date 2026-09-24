import java.util.Scanner;

public class Ejercicio19_apartado23 {
    public static void main(String[] args) {
        int contador =0, num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Escribe un numeros has el que quieas, para terminar escribe un 0");
            num = sc.nextInt();
            if (num > 0){
                contador ++;
            }
        }while (num != 0);

        System.out.println("El numero de positivos totales es de " + contador);

    }
}
