import java.util.Scanner;

public class Ejercicio20_apartado24 {
    public static void main(String[] args) {
        int diez =0, num, media = 0,notas = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Escribe tus notas, para finalizar escribe un -1");
            num = sc.nextInt();
            notas++;

            if (num !=-1){
                media += num;
            }
            if (num == 10){
                diez++;
            }
        }while (num != -1);
            media= media/(notas-1);
        System.out.println("Tu nota media es "+ media+ " y hassacado "+ diez +" dieces enhorabuena");

    }
}
