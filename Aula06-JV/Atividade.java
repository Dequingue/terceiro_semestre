import java.util.Scanner;
import java.util.ArrayList;


public class Atividade {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){


            int opcao =0;
            ArrayList<String> cadastro = new ArrayList<>();
            ArrayList<String> listaTf = new ArrayList<>();


            while (opcao !=4) {
                
                System.out.println("\t==== MENU ====\n");
                System.out.println("1- CADASTRO");
                System.out.println("2- LISTA");
                System.out.println("3- EXCLUIR");
                System.out.println("4- SAIR");
                System.out.println("Digite a opção: ");

                opcao = sc.nextInt();
    
                switch (opcao) {
                    case 1:
                        System.out.println("Cadastre seu nome: ");
                        String nome = sc.next();
                        cadastro.add(nome);

                        System.out.println("Cadastre seu Telefone: ");
                        String telefone = sc.next();
                        listaTf.add(telefone);

                        break;
                    case 2:
                        if(cadastro.isEmpty()){
                            System.out.println("Nenhum cadastro encontrado. ");

                        }else{
                            for(int i = 0 ; i< cadastro.size(); i++){
                                System.out.println("Nome: "+ cadastro.get(i)+ ", Telefone: "+listaTf.get(i));
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Digite o nome que deseja excluir: ");
                        String excluirNome = sc.next();
                        int index = cadastro.indexOf(excluirNome);

                        if (index != -1) {
                            cadastro.remove(index);
                            listaTf.remove(index); // Remover telefone correspondente
                            System.out.println("Registro de " + excluirNome + " removido com sucesso.");
                        } else {
                            System.out.println("Nome não encontrado.");
                        }
                        
                        break;
                    
                    case 4:
                        System.out.println("Systema encerrado.....");
                        break;    
                
                    default:
                        System.out.println("opção inválida, tente novamente!!!");
                        break;
                }
            }
        }
    }
}