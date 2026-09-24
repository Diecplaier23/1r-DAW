import java.util.Scanner;

public class Ejercicio4_subapartado20 {
    public static void main(String[] args) {
        float importe, importefinal,descuento = 0;
        String socio;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el importe");
        importe = sc.nextFloat();

        System.out.println("¿Eres socio? (si/no)");
        socio = sc.next();

        if (socio.equals("si")) {
            if (importe > 100) {
                descuento = 0.15F;
            }
            else if (importe > 50) {
                descuento = 0.10F;
            }

        } else {
            if (importe > 50) {
            descuento = 0.05F;
        }
        }

        importefinal = (importe - (importe * descuento));
        System.out.println("El improte final es: "+ importefinal);
}
}



