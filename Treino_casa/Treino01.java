import java.util.Scanner;


public class Treino01{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String nome="";
            int idade=0;
            String genero="";
            int opcao=0;
            String os="";

            /*Limpar */
            os = System.getProperty("os.name").toLowerCase();
            try {
                if (os.contains("win")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else {
                    new ProcessBuilder("clear").inheritIO().start().waitFor();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


            while (opcao !=5) {

                os = System.getProperty("os.name").toLowerCase();
                try {
                    if (os.contains("win")) {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } else {
                        new ProcessBuilder("clear").inheritIO().start().waitFor();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("====== MENU ======");
                System.out.println("1. Nome");
                System.out.println("2. Idade");
                System.out.println("3. Genero");
                System.out.println("4. Exibir");
                System.out.println("5. Fechar");

                 

                System.out.println("Digite uma opção: ");
                if(sc.hasNextInt()){// Verifica se a entrada é um número
                    opcao =sc.nextInt();
                    sc.nextLine();

                }else{
                    System.out.println("Insira um número valido");
                    opcao =sc.nextInt();
                    continue;
                }

                switch (opcao) {
                    case 1:
                        System.out.println("Digite seu nome: ");
                        nome= sc.nextLine();
                        break;
                    case 2:
                        System.out.println("Digite sua idade: ");
                        idade = sc.nextInt();
                        break;
                    case 3:
                        System.out.println("Digite seu Genero: ");
                        genero = sc.nextLine();
                        break;
                    case 4:
                        //limpar 
                        os = System.getProperty("os.name").toLowerCase();
                        try {
                            if (os.contains("win")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            } else {
                                new ProcessBuilder("clear").inheritIO().start().waitFor();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        System.out.println("Exibindo......");

                        //Equivalente ao time.sleep() do python 
                        try {
                            Thread.sleep(2000); // Pausa por 2 segundos (2000 milissegundos)
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        //Limpar 
                        os = System.getProperty("os.name").toLowerCase();
                        try {
                            if (os.contains("win")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            } else {
                                new ProcessBuilder("clear").inheritIO().start().waitFor();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        //Exibir 
                        System.out.println("Esse é seu Nome: "+nome); 
                        System.out.println("Essa é sua Idade: "+idade);
                        System.out.println("Esse é seu Genero: "+genero);

                         //Equivalente ao time.sleep() do python 
                         try {
                            Thread.sleep(5000); // Pausa por 5 segundos (5000 milissegundos)
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        break;
                    case 5:
                          //limpar 
                          os = System.getProperty("os.name").toLowerCase();
                          try {
                              if (os.contains("win")) {
                                  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                              } else {
                                  new ProcessBuilder("clear").inheritIO().start().waitFor();
                              }
                          } catch (Exception e) {
                              e.printStackTrace();
                          }

                        System.out.println("Encerrando o Systema.......");
  
                        //Equivalente ao time.sleep() do python 
                        try {
                            Thread.sleep(3000); // Pausa por 3 segundos (3000 milissegundos)
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        //limpar
                        os = System.getProperty("os.name").toLowerCase();
                        try {
                            if (os.contains("win")) {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            } else {
                                new ProcessBuilder("clear").inheritIO().start().waitFor();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        System.out.println("Systema encerrado.......");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");                
                }  
                
            }


        }
    }
}
