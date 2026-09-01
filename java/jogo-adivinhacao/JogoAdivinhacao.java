/*Faça como eu fiz: jogo de adivinhação
Agora é com você! Pratique os conceitos que foram ensinados ao longo dessa aula com o seguinte desafio:

Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e
pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve
informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

Dicas:
Para gerar um número aleatório em Java: new Random().nextInt(100);
Utilize o Scanner para obter os dados do usuário;
Utilize uma variável para contar as tentativas;
Utilize um loop para controlar as tentativas;
Utilize a instrução break; para interromper o loop.

*/
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado;

        System.out.println("Olá, esse é o jogo da adivinhação!");

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Parabéns, você acertou com " + tentativas + " tentativas!");
                break;
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("Número menor que o secreto");
            } else {
                System.out.println("Número maior que o secreto");
            }
        }
    }
}