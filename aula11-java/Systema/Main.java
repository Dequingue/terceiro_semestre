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
                            for (int i = 0; i < list.size(); i++) {
                                Livros lv = list.get(i);
                                System.out.println("\nIndice: "+i);
                                System.out.println("\nTitulo: "+lv.getTitulo()
                                +"\nAutor: "+lv.getAutor()
                                +"\nAno Publicado: "+lv.getAnoPublicado()
                                +"\nPreço: "+lv.getPreco()+"\n");
                            }                            
                        }


                        break;
                    case 3:
                        if (list.isEmpty()) {
                            System.out.println("Lista vazia, nada para alterar.");
                        } else {
                            System.out.print("Informe o índice do livro a ser alterado: ");
                            int indice = sc.nextInt();

                            if (indice >= 0 && indice < list.size()) {
                                Livros livro = list.get(indice);

                                System.out.println("Alterando o livro: " + livro.getTitulo());
                                System.out.print("Novo título (atual: " + livro.getTitulo() + "): ");
                                titulo = sc.next();
                                System.out.print("Novo autor (atual: " + livro.getAutor() + "): ");
                                autor = sc.next();
                                System.out.print("Novo ano publicado (atual: " + livro.getAnoPublicado() + "): ");
                                anoPublicado = sc.nextInt();
                                System.out.print("Novo preço (atual: " + livro.getPreco() + "): ");
                                preco = sc.nextDouble();

                                livro.setTitulo(titulo);
                                livro.setAutor(autor);
                                livro.setAnoPublicado(anoPublicado);
                                livro.setPreco(preco);

                             System.out.println("Livro atualizado com sucesso!");
                            } else {
                             System.out.println("Índice inválido!");
                            }
                        }
                        break;
                    case 4:
                        if(list.isEmpty()){
                            System.out.println("Lista vazia");
                        }else{
                            System.out.println("Informe o indece a ser removido: ");
                            int indi = sc.nextInt();

                            if(indi>=0 && indi<list.size()){
                                list.remove(indi);
                                System.out.println("Livro removido com Sucesso!");
                            }
                        }
                        
                        break;
                    case 5:
                        System.out.println("Systema Encerrado.....");
                        break;    
                    default:
                        System.out.println("ERRO invalido!!!!");
                        break;
                }
            }

        }
    }
    
}
