import java.util.Scanner;

public class Ejercicio2_subapartado20 {
    public static void main(String[] args) {
        float consumo, importe;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu consumo electrico:");
        consumo = sc.nextFloat();

        if (consumo <=100){

            importe = (float) (consumo *0.1);
            System.out.println("Tu import es es: "+ importe);

        } else if (consumo <=300) {

            importe = (float) (((consumo-100) *0.15)+(100*0.10));
            System.out.println("Tu import es es: "+ importe );

        }else {

            importe = (float) ((100 *0.1)+(200 *0.15)+((consumo-300) *0.20));
            System.out.println("Tu import es es: "+importe);
        }
    }
}
