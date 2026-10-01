public class Ejercicio32 {
    public static void main(String[] args) {
        int anterior = 0;
        int actual = 1;

        System.out.println("Primeros 40 terminos de Fibonacci:");
        for (int i = 1; i <= 40; i++) {
            System.out.println(anterior);
            int siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
        }
    }
}
