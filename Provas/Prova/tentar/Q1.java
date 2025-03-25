package tentar;

import java.util.ArrayList;
import java.util.Scanner;


// Aluno(s): Iuri Cauan, João Luiz, Luis Fernando

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Aviao> list = new ArrayList<>();
      

        int op = 0;
        int assentos_totais = 0;
        int numero_aviao = 0;
        int quantidade_avioes = 0;
        int quantidade_assentos = 0;
        int i =0;
        int contador = 0;
        String nome ="";
        int assentos=0;

        while (op!=6) {
            System.out.println("\n===== COMPANHIA AÉREA ======");
            System.out.println("1 - Cadastrar Aviões / Assentos");
            System.out.println("2 - Verificar Quantidade de Assentos Totais de cada Avião");
            System.out.println("3 - Reservar passagem Aérea");
            System.out.println("4 - Realizar Consulta por Avião");
            System.out.println("5 - Realizar Consulta por Passageiro");
            System.out.println("6- Sair do Sistema");
            System.out.println("Escolha a opção desejada: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Informe a quantidade de Aviões: ");
                    quantidade_avioes = sc.nextInt();

                    System.out.println("Informe a quantidade de Assentos: ");
                    quantidade_assentos = sc.nextInt();

                    if (quantidade_avioes > 4 && quantidade_assentos > 20){
                        System.out.println("Quantidade de Aviões e Assentos Indisponíveis");
                    }else{

                        list.add(new Aviao(quantidade_avioes, assentos_totais, quantidade_assentos));
                    }


                    break;
                    
                case 2:
                    System.out.println("\n==== Quantidade De Assentos ====");

                    for (i = 1; i <= quantidade_avioes; i++) {
                       
                        System.out.println(i+"ª Avião: "+quantidade_assentos+" Assentos");
                    }

                    break;

                case 3:
                    System.out.println("Informe o Número do Avião: ");
                    numero_aviao = sc.nextInt();
                    if (quantidade_assentos > 0) {
                        System.out.println("Informe o número do Assento Desejado");
                        assentos = sc.nextInt();
                        
                        System.out.println("Informe seu Nome: ");
                        nome = sc.next();
                        
                        contador = contador+1;

                        System.out.println("Reserva realizada com Sucessso!!");
                        
                        list.add(new Pessoa(quantidade_avioes, assentos_totais, quantidade_assentos, assentos, nome));

                        System.out.println("\nAssentos Disponiveis: "+(quantidade_assentos-1));
                    }else if (quantidade_assentos <= 0 ) {
                        System.out.println("Não Há assentos disponíveis para este avião !!");
                        
                    }else{
                        System.out.println("Este Avião não existe");

                    }
                    
                    break;
                    
                    

                case 4:
                    System.out.println("Informe o Número do Avião: ");
                    numero_aviao = sc.nextInt();

                    System.out.println("O avião tem : "+contador+" reservas");
                    
                    if (list.isEmpty()) {
                        System.out.println("Não Há aviões Cadastrados");
                        
                    }else{
                        for(i = 1; i<quantidade_assentos;i++){
                            Aviao av = list.get(i);
                            System.out.println("Assentos Registrados: "+av.getAssentos());

                        }


                    }
                    
                    break;

                case 5:
                    System.out.println("Informe o nome : ");
                    String nome_final = sc.next();

                    list.add(new Pessoa(quantidade_avioes, assentos_totais, quantidade_assentos, assentos, nome));
                    
                    
                    break;

                
                case 6:
                    System.out.println("\nEncerrando.....");
                    
                    break;
            
                default:
                    System.out.println("Opção Inválida, Tente Novamente");
                    break;
            }

            
        }




        sc.close();
    }
}



