import java.util.ArrayList;
import java.util.Scanner;


// João Luiz, Iuri Cauan, Luis Fernando

public class Aeroporto {
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Aviao> avioes = new ArrayList<>();
            ArrayList<Pessoa> reservas = new ArrayList<>();

            int opcao = 0;
            while (opcao != 6) {
                System.out.println("\n===== COMPANHIA AÉREA =====");
                System.out.println("1 - Cadastrar Aviões / Assentos");
                System.out.println("2 - Verificar Quantidade de Assentos Totais de cada Avião");
                System.out.println("3 - Reservar passagem Aérea");
                System.out.println("4 - Realizar Consulta por Avião");
                System.out.println("5 - Realizar Consulta por Passageiro");
                System.out.println("6 - Sair do Sistema");
                System.out.print("Escolha a opção desejada: ");
                opcao = sc.nextInt();
                sc.nextLine(); // Limpar buffer
                
                switch (opcao) {
                    case 1:
                        if (avioes.size() >= 4) {
                            System.out.println("Já existem 4 aviões cadastrados.");
                            break;
                        }
                        System.out.print("Informe o número do avião: ");
                        int numeroAviao = sc.nextInt();
                        System.out.print("Informe a quantidade de assentos: ");
                        int assentos = sc.nextInt();
                        avioes.add(new Aviao(numeroAviao, assentos));
                        System.out.println("Avião cadastrado com sucesso!");
                        break;
                    
                    case 2:
                        System.out.println("\n==== Quantidade De Assentos ====");
                        for (Aviao aviao : avioes) {
                            System.out.println("Avião " + aviao.getNumero() + ": " + aviao.getAssentosDisponiveis() + " assentos disponíveis");
                        }
                        break;
                    
                    case 3:
                        if (reservas.size() >= 20) {
                            System.out.println("Limite de 20 reservas atingido.");
                            break;
                        }
                        System.out.print("Informe o número do avião: ");
                        numeroAviao = sc.nextInt();
                        sc.nextLine();
                        
                        Aviao aviaoSelecionado = null;
                        for (Aviao aviao : avioes) {
                            if (aviao.getNumero() == numeroAviao) {
                                aviaoSelecionado = aviao;
                                break;
                            }
                        }
                        
                        if (aviaoSelecionado == null) {
                            System.out.println("Este avião não existe!");
                            break;
                        }
                        
                        if (!aviaoSelecionado.reservarAssento()) {
                            System.out.println("Não há assentos disponíveis para este avião!");
                            break;
                        }
                        
                        System.out.print("Informe o nome do passageiro: ");
                        String nome = sc.nextLine();
                        reservas.add(new Pessoa(nome, numeroAviao));
                        System.out.println("Reserva realizada com sucesso!");
                        break;
                    
                    case 4:
                        System.out.print("Informe o número do avião: ");
                        numeroAviao = sc.nextInt();
                        
                        boolean encontrou = false;
                        System.out.println("Reservas para o avião " + numeroAviao + ":");
                        for (Pessoa reserva : reservas) {
                            if (reserva.getNumeroAviao() == numeroAviao) {
                                System.out.println("Passageiro: " + reserva.getNome());
                                encontrou = true;
                            }
                        }
                        if (!encontrou) {
                            System.out.println("Não há reservas realizadas para este avião!");
                        }
                        break;
                    
                    case 5:
                        System.out.print("Informe o nome do passageiro: ");
                        nome = sc.nextLine();
                        
                        encontrou = false;
                        System.out.println("Reservas do passageiro " + nome + ":");
                        for (Pessoa reserva : reservas) {
                            if (reserva.getNome().equalsIgnoreCase(nome)) {
                                System.out.println("Avião: " + reserva.getNumeroAviao());
                                encontrou = true;
                            }
                        }
                        if (!encontrou) {
                            System.out.println("Não há reservas realizadas para este passageiro!");
                        }
                        break;
                    
                    case 6:
                        System.out.println("Encerrando sistema...");
                        
                        return;
                    
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            }
        }
    }
}
