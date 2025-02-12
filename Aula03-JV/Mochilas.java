import java.util.Scanner;

public class Mochilas {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int op = 0;
            

            while(op !=4){
                System.out.println("\n==== MENU ====");
                System.out.println("1. Mochila Escolar");
                System.out.println("2. Mochila de Viagem");
                System.out.println("3. Mochila Esportiva");
                System.out.println("4. SAIR");
                System.out.println("Digite a opção: ");
                op =sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("Item selecionado: [Mochila Escolar] ");
                        System.out.println("Compacta e ideal para estudantes");
                    
                        break;
                    case 2:
                        System.out.println("Item selecionado: [Mochila de Viagem]");
                        System.out.println("Espaçosa, ideal para longas jornadas");

                        break;
                    case 3:
                        System.out.println("Item selecionado: [Mochila Esportiva]");
                        System.out.println("Leve, resistente e ergonômica");
                        break;
                    case 4:
                        System.out.println("Ecerrando o Systema....");
                        break;    
                    
                    default:
                        System.out.println("[ERRO] Digite um valor valido!!!!");
                        break;
                }
            }

        }
    }
}
