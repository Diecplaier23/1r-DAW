import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las longitudes de los tres lados:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("IMPOSIBLE");
            return;
        }

        double[] lados = {a, b, c};
        java.util.Arrays.sort(lados);
        double menor = lados[0];
        double medio = lados[1];
        double mayor = lados[2];

        if (menor + medio <= mayor) {
            System.out.println("IMPOSIBLE");
            return;
        }

        double diferencia = mayor * mayor - (menor * menor + medio * medio);
        double tolerancia = 1e-10 * Math.max(mayor * mayor, menor * menor + medio * medio);
        if (Math.abs(diferencia) <= tolerancia) {
            System.out.println("RECTANGULO");
        } else if (diferencia < 0) {
            System.out.println("ACUTANGULO");
        } else {
            System.out.println("OBTUSANGULO");
        }
    }
}
