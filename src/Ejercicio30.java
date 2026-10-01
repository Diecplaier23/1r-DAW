import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        String texto;
        String textoSinEspacios = "";
        boolean palindromo = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una palabra o frase:");
        texto = sc.nextLine();
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            if (Character.isLetterOrDigit(texto.charAt(i))) {
                textoSinEspacios += texto.charAt(i);
            }
        }

        for (int i = 0; i < textoSinEspacios.length() / 2; i++) {
            if (textoSinEspacios.charAt(i) != textoSinEspacios.charAt(textoSinEspacios.length() - 1 - i)) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("La palabra o frase es palindroma.");
        } else {
            System.out.println("La palabra o frase no es palindroma.");
        }
    }
}
