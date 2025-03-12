import java.util.Scanner;
import java.util.ArrayList;

public class AnimalApp {

    public static void main(String[] args) {
        ArrayList<Animal>list =new ArrayList<>();
        
        try(Scanner sc = new Scanner(System.in)){
            int op = 0;

            while (op !=3) {
                System.out.println("==== MENU ====\n");
                System.out.println("1.CADASTRAR");
                System.out.println("2.LISTAR");
                System.out.println("3.FECHAR");
                System.out.println("Digite uma opção: ");
                if(sc.hasNextInt()) {
                    op=sc.nextInt();    
                } else {
                    System.out.println("Opção inválida");
                }
                

                switch (op) {
                    case 1:
                        System.out.println("Infome o animal: ");
                        String tipo=sc.next();
                        System.out.println("Informe o som que esse naimal faz: ");
                        String fazerSom = sc.next();

                        if (tipo.equalsIgnoreCase("gato")) {
                            list.add(new Gato(tipo, fazerSom));
                        } else if (tipo.equalsIgnoreCase("cachorro")) {
                            list.add(new Cachorro(tipo, fazerSom));
                        } else {
                            System.out.println("Tipo de animal inválido!");
                        }

                        break;
                    case 2:
                        if (list.isEmpty()) {
                            System.out.println("Lista vazia");
                        } else {
                            System.out.println("\nLista de Animais:");
                            for (Animal exibir : list) {
                                System.out.println("Tipo: " + exibir.getTipo());
                            }

                        
                            System.out.print("\nDeseja saber o som de algum animal (S=1 | N=2)?: ");
                            int inform = sc.nextInt();
                            if (inform == 1) {
                                System.out.println("\nSom dos Cachorros:");
                                for (Animal an : list) {
                                System.out.println("Tipo: " + an.getTipo() + ", Som: " + an.getFazerSom());
                                }

                            
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Systema incerrado....");
                        break;
                    default:
                        System.out.println("[Erro]Opção invalida!!!");
                        break;
                }
            }

        }
    }

    
}
