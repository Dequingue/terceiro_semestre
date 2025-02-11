import java.util.Scanner;

public class At01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opcao = 0;
            String name = ""; // Inicializa a variável
            String email = ""; // Inicializa a variável
            int idade = 0;

            while (opcao != 4) {
                System.out.println("\n==== MENU ====");
                System.out.println("1. Digitar Nome");
                System.out.println("2. Digitar Idade");
                System.out.println("3. Digitar Email");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");

                if (sc.hasNextInt()) { // Verifica se a entrada é um número
                    opcao = sc.nextInt();
                    sc.nextLine(); // Limpa o buffer após o nextInt()
                } else {
                    System.out.println("Por favor, insira um número válido.");
                    sc.nextLine(); // Limpa a entrada inválida
                    continue;
                }

                switch (opcao) {
                    case 1:
                        System.out.print("Digite seu nome: ");
                        name = sc.nextLine(); // Usa nextLine() para capturar nomes completos
                        break;
                    case 2:
                        System.out.print("Digite sua idade: ");
                        if (sc.hasNextInt()) {
                            idade = sc.nextInt();
                            sc.nextLine(); // Limpa o buffer
                        } else {
                            System.out.println("Idade inválida! Digite um número inteiro.");
                            sc.nextLine(); // Limpa entrada inválida
                        }
                        break;
                    case 3:
                        System.out.print("Digite seu Email: ");
                        email = sc.nextLine();
                        break;
                    case 4:
                        System.out.println("\n==== DADOS INSERIDOS ====");
                        System.out.println("Nome: " + name);
                        System.out.println("Idade: " + idade);
                        System.out.println("Email: " + email);
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            }
        }
    }
}



