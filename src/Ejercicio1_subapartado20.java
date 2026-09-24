import java.util.Scanner;

public class Ejercicio1_subapartado20 {
    public static void main(String[] args) {
        float altura, peso;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu peso y altura en(m)");
        peso = sc.nextFloat();
        altura = sc.nextFloat();

        float imc = peso /(altura*altura);
        System.out.println(imc);

        if (imc >=30){

            System.out.println("Ovesidad");

        } else if (imc >24.9) {

            System.out.println("Sobrepeso");

        } else if (imc >18.5) {

            System.out.println("Normal");

        }else {

            System.out.println("Bajo peso");
        }
    }
}
