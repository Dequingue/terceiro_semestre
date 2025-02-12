import java.util.Scanner;

public class Caneta {

    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in) ){
            int op = 0;
            

            while(op !=4){
                System.out.println("\n==== MENU ====");
                System.out.println("1. Esferografica");
                System.out.println("2. Gel ");
                System.out.println("3. Tinteiro");
                System.out.println("4. SAIR");
                System.out.println("Digite a opção: ");
                op =sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("Item selecionado: [Caneta Esferográfica] ");
                        System.out.println("Econômica e de longa duração");
                    
                        break;
                    case 2:
                        System.out.println("Item selecionado: [Caneta Gel]");
                        System.out.println("Tinta mais pigmentada e escrita suave");

                        break;
                    case 3:
                        System.out.println("Item selecionado: [Caneta Tinteiro]");
                        System.out.println("Clássica e elegante, usada para caligrafia");
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
