import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> lista = new ArrayList<>();

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Cadastrar pessoa");
            System.out.println("2. Listar pessoas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();
                System.out.print("Digite a idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine();
                Pessoa pessoa = new Pessoa(nome, idade);
                lista.add(pessoa);
                System.out.println("Pessoa cadastrada com sucesso!!");

            } else if (opcao == 2) {
                if (lista.isEmpty()) {
                    System.out.println("Nenhuma pessoa cadastrada.");
                } else {
                    System.out.println("\n=== Lista de Pessoas ===");
                    for (Pessoa p : lista) {
                        System.out.println(p);
                    }
                }

            } else if (opcao == 3) {
                System.out.println("Encerrando o programa...");
                break;

            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
