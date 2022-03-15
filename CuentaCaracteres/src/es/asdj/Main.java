package es.asdj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto;
        int contador = 0;

        System.out.println("Escribe una frase: ");
        texto = entrada.nextLine();
        System.out.println();
        System.out.print("Dame un carácter: ");
        char letra = entrada.nextLine().charAt(0);
        System.out.println();

         for (int i = 0; i < texto.length(); i++) {
            if (letra == texto.charAt(i)) {
                contador++;
            }
        }
        System.out.print("Número de veces que aparece el carácter " + letra + ": " + contador);
    }
}
