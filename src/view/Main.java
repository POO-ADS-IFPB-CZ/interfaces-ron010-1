
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome do Triatleta: ");
        String nome = sc.nextLine();

        Triatleta t = new Triatleta(nome);

        int controller = 1;

        while(controller != 0) {
            System.out.println("\nMenu Triatleta:");
            System.out.println("0 - " + t.getNome() + " descansar");
            System.out.println("1 - Aquecer");
            System.out.println("2 - Nadar");
            System.out.println("3 - Correr");
            System.out.println("4 - Correr de Bicicleta");

            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch(opcao) {
                case 0: 
                    controller = 0;
                    System.out.println(t.getNome() + " foi dormir para descansar...");
                break;
                case 1:
                    t.aquecer();
                    break;
                case 2:
                    t.nadar();
                    break;
                case 3:
                    t.correr();
                    break;
                case 4:
                    t.correrDeBiciclete();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        sc.close();

    }
}