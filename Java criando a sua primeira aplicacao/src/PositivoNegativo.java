//Crie um programa que solicite ao usuário digitar um número.
// Se o número for positivo, exiba "Número positivo",
// caso contrário, exiba "Número negativo".

import java.util.Scanner;

public class PositivoNegativo {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        {
            int UserNum = leitor.nextInt();
            System.out.println("digite um numero aliatorio");

            if (UserNum > 0) {
                System.out.println("é positivo");
            } else {
                System.out.println("é negativo");
            }
        }

    }
}
