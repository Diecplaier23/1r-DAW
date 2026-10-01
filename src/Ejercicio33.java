public class Ejercicio33 {
    public static void main(String[] args) {
        int anterior = 1;
        int actual = 1;

        System.out.println("Relaciones entre terminos consecutivos de Fibonacci:");
        for (int i = 1; i <= 40; i++) {
            System.out.println(actual + " / " + anterior + " = " + (double) actual / anterior);
            int siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
        }
    }
}
