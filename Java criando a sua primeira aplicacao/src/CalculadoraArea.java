import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int escolha;

        System.out.println("opcao1. Calcular área do quadrado");
        System.out.println("opcao2. Calcular área do círculo");
        System.out.println("Escolha uma opcao");
        escolha = leitor.nextInt();

        if (escolha == 1) {
            System.out.println("Opcao 1: escolha o numero do quadrado ");
            int numb1 = leitor.nextInt();
            int conta1 = numb1 * numb1;
            System.out.println(numb1 + " x por ele mesmo é igual a " + conta1);
        } else if (escolha == 2) {
            System.out.println("Opcao 2: escolha o numero do circulo (raio) ");
            double numb2 = leitor.nextDouble();
            double conta2 = numb2 * numb2 * Math.PI;
            System.out.println("Área = " + numb2 + " x " + numb2 + " x π = " + conta2);
        } else {
            System.out.println("opcao invalida");
        }
    }
}