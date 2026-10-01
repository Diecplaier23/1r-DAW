public class Ejercicio29 {
    public static void main(String[] args) {
        for (int num = 3; num <= 100; num++) {
            boolean primo = true;

            if (num % 2 == 0) {
                primo = false;
            } else {
                for (int i = 3; i <= num / 2; i += 2) {
                    if (num % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.println(num);
            }
        }
    }
}
