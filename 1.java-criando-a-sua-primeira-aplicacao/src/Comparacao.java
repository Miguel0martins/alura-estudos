//Peça ao usuário para inserir dois números inteiros.
// Compare os números e imprima uma mensagem indicando se são iguais, diferentes,
// o primeiro é maior ou o segundo é maior.

import java.util.Scanner;

public class Comparacao {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        {
            int Numb1 = leitor.nextInt();
            System.out.println("digite um numero aliatorio");

            int Numb2 = leitor.nextInt();
            System.out.println("digite outro numero aliatorio");

            if (Numb1 > Numb2) {
                System.out.println("o numero " + Numb1 + " é maior que o numero " + Numb2);
            } else if (Numb1 < Numb2) {
                System.out.println("o numero " + Numb1 + " é menor que o numero " + Numb2);
            } else if (Numb1 == Numb2) {
                System.out.println("o numero " + Numb1 + " é igual que o numero " + Numb2);
            }
        }

    }
}