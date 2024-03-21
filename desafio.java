import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        /* Declaração variaveis */
        String nome = "Vinícius Lacerda";
        String tipoConta = "Corrente";
        double saldo = 1000;
        int opcao = 0;

        System.out.println("*********************************");
        System.out.println("Dados iniciais do cliente: ");

        System.out.println("\n Nome: " + nome);
        System.out.println(" Tipo Conta: " + tipoConta);
        System.out.println(" Saldo inicial:  R$ " + saldo);
        System.out.println("\n*********************************");

        String menu = """
                ** Digite sua opção**
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        while(opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
         if(opcao == 1){
            System.out.println(saldo);
        } else if(opcao == 2){
             System.out.println("Qual valor será transferido?");
             double valorTransferido = leitura.nextDouble();
             if(valorTransferido > saldo){
                 System.out.println("Não há saldo sulficiente");
             } else{
              saldo -= valorTransferido;
             System.out.println(" O seu saldo agora é " + saldo);}
         }if (opcao == 3){
                System.out.println("Qual valor deseja receber ? ");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println("Seu saldo atualizado é " + saldo);
            } else if(opcao != 4){
                System.out.println("opcao invalida");
            }

        }
            leitura.close();
    }
}
