//Crie um programa que solicite ao usuário um número
// e exiba a tabuada desse número de 1 a 10.

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int Num  = leitor.nextInt();
        for(int i=0; i<10;i++ ){
            int Resultado = (Num * i);
            System.out.println(Resultado);
        }


    }
}
