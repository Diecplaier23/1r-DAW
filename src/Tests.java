public class Tests {
    public static void main(String[] args) {
        int resultado=0, c=0, n_cifras=2, num=37;

        for (int i = 0; i < n_cifras; i++) {

            c= Integer.parseInt(String.valueOf(num).substring(i, i + 1));

            System.out.println(c+ " "+i);

            resultado += (int) Math.pow(c, n_cifras); // Eleva cifra al numero de cifras

            System.out.println(resultado);
        }
    }
}
