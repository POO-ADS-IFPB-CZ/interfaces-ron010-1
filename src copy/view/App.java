
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Conta c = null;
        Scanner sc = new Scanner(System.in);
        int opcao;
        int num;
        System.out.println("Qual tipo de conta deseja criar?");
        System.out.println("1 - Criar Conta");
        System.out.println("2 - Criar Conta Especial");
        System.out.println("3 - Criar conta Poupanca");
        System.out.println("4 - Sair");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                c = new Conta(2, "Riquelme");

                do {
                    System.out.println("1 - Você deseja depositar?\n" +
                            "2 - Você deseja sacar?\n" +
                            "3 - Ver saldo?\n" +
                            "4 - Sair:");
                    num = sc.nextInt();

                    switch (num) {
                        case 1:
                            System.out.println("Quantidade para depositar?");
                            double deposito = sc.nextDouble();
                            c.depositar(deposito);
                            break;
                        case 2:
                            System.out.println("Quantidade para sacar?");
                            double saque = sc.nextDouble();
                            c.sacar(saque);
                            break;
                        case 3:
                            System.out.println("Saldo atual: " + c.getSaldo());
                            break;
                        case 4:
                            System.out.println("Saindo...");
                            System.exit(0);
                        default:
                            break;
                    }
                } while (num != 3);
                break;
            case 2:
                c = new ContaEspecial(3, "Raika", 300);
                System.out.println("Quantidade para sacar?");
                double deposito = sc.nextDouble();
                c.sacar(deposito);
                System.out.println("Saldo atual: " + c.getSaldo());
                break;
            case 3:
                c = new ContaPoupanca(4, "Maria");
                System.out.println("Quantidade para depositar?");
                double valor = sc.nextDouble();
                System.out.println("Qual o valor para reajuste?");
                double reajuste = sc.nextDouble();

                c.depositar(valor);
                c.reajustar(reajuste);

                System.out.println("Saldo atual: " + c.getSaldo());
                break;
            case 4:
                System.out.println("Saindo...");
                System.exit(0);
            default:
                break;
        }

        c.imprimirTipoConta();

        sc.close();
    }
}
