import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nome = "Nickollas";
        String conta = "Conta Corrente";
        double saldo = 1000;
        int opcao = 0;

        System.out.println("Bem vindo senhor " + nome);
        System.out.println("Ssaldo atual: " + saldo);

        String menu = """
                
                Digite uma das opções abaixo:
                
                1- Consultar saldo
                2- Transferir
                3- Sacar
                4- Receber valor
                5- Sair
                
                """;

            while (opcao != 5) {
                System.out.println(menu);
                opcao = leitor.nextInt();

                if (opcao == 1) {
                    System.out.println("Seu saldo atual é: " + saldo);

                } else if (opcao == 2) {
                    System.out.println("Qual o valor que deseja transferir??");
                    double valor = leitor.nextDouble();
                    if (saldo < valor) {
                        System.out.println("Saldo insuficiente para realizar a transferencia");
                    } else {
                        saldo -= valor;
                        System.out.println("Transferencia realizada com sucesso");
                        System.out.println("Seu saldo atual é: " + saldo);
                    }
                } else if (opcao == 3) {
                    System.out.println("Qual o valor que deseja sacar?");
                    double valor = leitor.nextInt();
                    if (valor > saldo) {
                        System.out.println("Não há saldo suficiente para realizar o saque!!");
                    } else {
                        saldo -= valor;
                        System.out.println("Saque realizado com sucesso!!");
                        System.out.println("Seu saldo atual é:" + saldo);
                    }

                } else if (opcao == 4) {
                    System.out.println("Qual o valor que deseja receber?");
                    double valor = leitor.nextDouble();
                    System.out.println("Saldo atualizado com sucesso!");
                    saldo += valor;
                    System.out.println("Saldo atual é " + saldo);

                } else if (opcao != 5) {
                    System.out.println("Opção invalida!");

                }
            }


    }
}

