/*
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. 

> IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
*/

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = 0, b = 1, num = -1;

            /*
                É possível comentar as linhas 18 à 19 e inserir o número diretamente na variável num.
            */

            System.out.print("Informe um número: ");
            num = scanner.nextInt();

            if (num == a || num == b) {
                System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
                return;
            }

            while (num > b) {
                b += a;
                a = b - a;

                if (num == b) {
                    System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
                    return;
                }
            }
            System.out.println("O número " + num + " NÃO pertence à sequência de Fibonacci.");
        }
    }
}
