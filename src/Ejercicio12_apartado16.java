import java.util.Scanner;

public class Ejercicio12_apartado16 {
    public static void main(String[] args) {
    //definir variables
        int num1, num2;
        String operacion;
    //Pedir numeros
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos numeros:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
    //Pedir operacion
        Scanner signo = new Scanner(System.in);

        System.out.println("Introduce la operación a realizar (+, -, *, /): ");
        operacion = sc.next();
    //Resultados
        switch (operacion) {
            case "+":
                System.out.println("El resultado de sumar " + num1 +" y " + num2 + " es"+ num1 + num2);
                break;
            case "-":
                System.out.println("El resultado de sumar " + num1 +" y " + num2 + " es"+ num1 + num2);
                break;
            case "*":
                System.out.println("El resultado de sumar " + num1 +" y " + num2 + " es"+ num1 + num2);
                break;
            case "/":
                System.out.println("El resultado de sumar " + num1 +" y " + num2 + " es"+ num1 + num2);
                break;
        }
    }
}
