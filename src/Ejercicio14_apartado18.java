import java.util.Scanner;

public class Ejercicio14_apartado18 {
    public static void main(String[] args) {
    //definir variables
        int horas, minutos, segundos;
    //pedir hora
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce horas minutos segundos");
        horas = sc.nextInt();
        minutos = sc.nextInt();
        segundos = sc.nextInt();
    //sumarle +1 segundo
        segundos++;
    //comprobar hora
        if (segundos >=60){
            segundos = (segundos -60);
            minutos++;
        }
        if (minutos >=60){
            minutos = (minutos - 60);
            horas++;
        }
    //mosrar hora actual
        System.out.println("Son las" +horas +":"+minutos+":"+segundos);
    }
}
