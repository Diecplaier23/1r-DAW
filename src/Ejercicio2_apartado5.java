import java.util.Scanner;
public class Ejercicio2_apartado5 {
    public static void main(String[] args) {
    //Declarar variables
        int x;
        int y;
     //Pedir datos al usuario
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero:");
        x = sc.nextInt();

        System.out.println("Escrbe un segundo numero:");
        y = sc.nextInt();
    //Operaciones
        int sum = x+y;
        int rest = x-y;
        int mult = x*y;
        int div = x/y;
    //Mostrar por pantalla los resultados
        System.out.println("Los resultados son: suma: "+sum + " resta: " + rest + " multiplicacion: " + mult + " division: " + div);
    }
}
