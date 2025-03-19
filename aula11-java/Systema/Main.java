package Systema;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Livros>list = new ArrayList<>();

        try(Scanner sc = new Scanner(System.in)){

            int op= 0;
            String titulo;
            String autor;
            int anoPublicado=0;
            double preco=0;

            while (op !=5) {
                
            
                System.out.println("\t====== MENU ======\n");
                System.out.println("1.CADASTRAR");
                System.out.println("2.LISTAR");
                System.out.println("3.ALTERAR");
                System.out.println("4.REMOVER");
                System.out.println("5.FINALIZAR");
                System.out.println("Infome uma opção: ");

                if(sc.hasNextInt()){
                    op = sc.nextInt();
                }else{
                    System.out.println("Opção invalida");
                }

                switch (op) {
                    case 1:
                        System.out.println("Infomer o titulo: ");    
                        titulo =sc.next();
                        System.out.println("Infomer o autor: ");
                        autor =sc.next();
                        System.out.println("Informe o ano Publicado: ");
                        anoPublicado = sc.nextInt();
                        System.out.println("Informe o valor: ");
                        preco = sc.nextDouble();

                        list.add(new Livros(titulo, autor, anoPublicado, preco));


                        break;
                    
                    case 2:
                        if(list.isEmpty()){
                            System.out.println("Lista vazia");
                        }else{
                            for (Livros lv : list) {
                                System.out.println(lv+"\nTitulo: "+lv.getTitulo()+"\nAutor: "+lv.getAutor()+"\nAno Publicado: "+lv.getAnoPublicado()+"\nPreço: "+lv.getPreco()+"\n");
                            }                            
                        }


                        break;
                    case 3:
                        
                        break;
                    case 4:
                        if(list.isEmpty()){
                            System.out.println("Lista vazia");
                        }else{
                            System.out.println("Informe o indece a ser removido: ");
                            int indice = sc.nextInt();

                            if(indice>=0 && indice<list.size()){
                                list.remove(indice);
                                System.out.println("Livro removido com Sucesso!");
                            }
                        }
                        
                        break;
                    case 5:
                        
                        break;    
                    default:
                        System.out.println("ERRO invalido!!!!");
                        break;
                }
            }

        }
    }
    
}
