//Crie um programa que solicite ao usuário a entrada de um número inteiro.
// Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

import java.util.Scanner;
public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int Num = leitor.nextInt();
        System.out.println("digite um numero inteiro:");

        if (Num % 2 == 0){
            System.out.println("par");
        }else {
            System.out.println("impar");
        }
    }
}
