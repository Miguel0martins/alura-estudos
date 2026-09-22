//Crie um programa que solicite ao usuário um número
// e calcule o fatorial desse número.

import java.util.Scanner;

public class Fatorial  {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int fatorial = new Scanner(System.in).nextInt();

        for (int i = 1; i <= 10; i++) {
            fatorial = fatorial * i;
            System.out.println(fatorial);
        }

    }
}