import javax.swing.*;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nomeCliente = "Cristiani Budnik";
        String tipoDeConta = "Conta Corrente";
        double saldo = 2700.99;
        int opcao = 0;

        System.out.println("********************************");
        System.out.println("\nNome do cliente: " + nomeCliente);
        System.out.println("Tipo Conta: " + tipoDeConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n********************************");

        String menu = """
                ** Digite uma opcao **
                1 - Consultar Saldo
                2 - Realizar uma transferencia
                3 - Depositar (Dinheiro, Cheque)
                4 - Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitor.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atual e: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir? ");
                double valor = leitor.nextDouble();
                if (valor > saldo) {
                    System.out.println("Nao foi possivel realizar a transferencia, SALDO INSUFICIENTE!");
                } else {
                    saldo -= valor;
                    System.out.println("Transferencia concluida no valor de " + valor);
                }

            } else if (opcao == 3) {
                System.out.println("Valor a ser depositado: ");
                double valor = leitor.nextDouble();
                saldo += valor;
                System.out.println("O valor " + valor + " foi depositado com sucesso!");
            } else if (opcao != 4) {
                System.out.println("Opcao invalida");
                
            }
                {

                }
        }
        System.out.println("Muito obrigado(a) por utilizar nossos servicos");
    }
}
