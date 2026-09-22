//Inicializar dados do cliente
//Menu de opções
//Visualização do saldo
//Enviar valor
//Receber valor

import java.util.Scanner;

public class BancoDigital {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String Nome = "Rick";
        String TipoConta = "Corrente";
        double Saldo = 1250.59;
        int opcao = 0;

        System.out.println("\n***************");
        System.out.println("\nConta" + TipoConta);
        System.out.println("Olá" + Nome);

        String Menu = """
                ---Menu---
                1.Consultar saldo.
                2.Enviar Valor.
                3.Receber Valor.
                4.Sair""";


        while(opcao != 4) {
            System.out.println(Menu);
            opcao = leitor.nextInt();
            if(opcao == 1){
                System.out.println(Saldo);
            }else if(opcao == 2){
                double Retirado = 0;
                        System.out.println("digite o valor desejado para ser enviado:");
                Retirado = leitor.nextDouble();
                Saldo = Saldo - Retirado;
            }
            else if(opcao == 3){
                double Recebido = 0;
                System.out.println("digite o valor desejado para ser Recebido:");
                Recebido = leitor.nextDouble();
                Saldo = Saldo - Recebido;
            } else if (opcao == 4) {
                System.out.println("ok obrigado");
                break;
            }else {
                System.out.println("erro");
            }
        }
        }
    }

