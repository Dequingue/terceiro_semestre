import java.util.ArrayList;
import java.util.Scanner;
public class PessoaApp {

    public static void main(String[] args) {
       
        ArrayList<Pessoa>list=new ArrayList<>();

        try(Scanner sc=new Scanner(System.in)){
            int op=0;
            while (op!=4) {
                System.out.println("\n:::: Menu ::::");
                System.out.println("1. CADASTRAR");
                System.out.println("2.LISTAR");
                System.out.println("3.REMOVER");
                System.out.println("4.SAIR");
                System.out.println("Escolha a opção: ");
                op=sc.nextInt();

                switch (op) {
                    case 1:
                    System.out.println("Informe o nome: ");
                    String nome=sc.next();
                    System.out.println("Informe o telefone: ");
                    String telefone=sc.next();

                    list.add(new Pessoa(nome, telefone));
                        break;
                    
                    case 2:
                        if(list.isEmpty()){
                            System.out.println("Lista vazia");
                        }else{
                            for(Pessoa p : list){
                                System.out.println("Nome: "+p.getNome()+"\n telefone: "+p.getTelefone());
                            }
                        }
                        break;
                    case 3:
                        if(list.isEmpty()){
                            System.out.println("Lista vazia");
                        }else{
                            System.out.println("Informe o indice a ser removido: ");
                            int indice = sc.nextInt();

                            if(indice>=0 && indice<list.size()){
                                list.remove(indice);
                                System.out.println("Contato Removido com Sucesso!");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Systema Encerrado....");
                        break;
                        
                    default:
                        System.out.println("Opção Inválida");
                        break;
                }
            }




        }






        /*Pessoa p1 = new Pessoa("Anderson", "5555");
        System.out.println("nome: "+p1.getNome()+"\n telefone: "+p1.getTelefone());
        p1.setNome("edivadecideCleide");

        System.out.println("O novo nome é: "+p1.getNome()+"\n telefone: "+p1.getTelefone());

        Pessoa p2 = new Pessoa("carlos", "555555");

        System.out.println("Nome: "+p2.getNome()+"\n telefone: "+p2.getTelefone()); */


        
    }
    
}
