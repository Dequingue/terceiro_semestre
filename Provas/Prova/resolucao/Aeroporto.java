package resolucao;

import java.util.ArrayList;
import java.util.Scanner;





public class Aeroporto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aviao> avioes = new ArrayList<>();
        ArrayList<Reserva> reservas = new ArrayList<>();

        while (true) {
            System.out.println("\n===== COMPANHIA AÉREA SWEET FLIGHT =====");
            System.out.println("1 - Cadastrar Avião");
            System.out.println("2 - Reservar Passagem");
            System.out.println("3 - Consultar Reservas por Avião");
            System.out.println("4 - Consultar Reservas por Passageiro");
            System.out.println("5 - Encerrar");
            System.out.print("Escolha a opção desejada: ");
            int opcao = sc.nextInt();
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
                    String passageiro = sc.nextLine();
                    reservas.add(new Reserva(passageiro, numeroAviao));
                    System.out.println("Reserva realizada com sucesso!");
                    break;
                
                case 3:
                    System.out.print("Informe o número do avião: ");
                    numeroAviao = sc.nextInt();
                    
                    boolean encontrou = false;
                    System.out.println("Reservas para o avião " + numeroAviao + ":");
                    for (Reserva reserva : reservas) {
                        if (reserva.getNumeroAviao() == numeroAviao) {
                            System.out.println("Passageiro: " + reserva.getPassageiro());
                            encontrou = true;
                        }
                    }
                    if (!encontrou) {
                        System.out.println("Não há reservas realizadas para este avião!");
                    }
                    break;
                
                case 4:
                    System.out.print("Informe o nome do passageiro: ");
                    passageiro = sc.nextLine();
                    
                    encontrou = false;
                    System.out.println("Reservas do passageiro " + passageiro + ":");
                    for (Reserva reserva : reservas) {
                        if (reserva.getPassageiro().equalsIgnoreCase(passageiro)) {
                            System.out.println("Avião: " + reserva.getNumeroAviao());
                            encontrou = true;
                        }
                    }
                    if (!encontrou) {
                        System.out.println("Não há reservas realizadas para este passageiro!");
                    }
                    break;
                
                case 5:
                    System.out.println("Encerrando sistema...");
                    sc.close();
                    return;
                
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
