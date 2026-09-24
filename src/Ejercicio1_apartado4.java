import java.util.Scanner;
public class Ejercicio1_apartado4 {
    public static void main(String[] args) {
        float lado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la medida:");
        lado = sc.nextFloat();
        float area = lado*lado;
        System.out.printf("El area es" + area);
    }
}
