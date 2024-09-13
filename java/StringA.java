/*
Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre. 

> IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código; 
*/

import java.util.Scanner;

public class StringA {
    public static void main(String[] args) {
        int quant = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            /*
                É possível comentar a linha 18 e 19 e descomentar a linha 21 para inserir o texto diretamente no código.
            */

            System.out.print("Insira um texto: ");
            String text = scanner.nextLine();

            // String text = "Texto A teste a ";

            for (char c : text.toCharArray()) {
                if (c == 'a' || c == 'A') {
                    quant++;
                }
            }

            System.out.println("A letra 'a' aparece " + quant + " vezes no texto.");
        }
    }
}

