import java.util.Scanner;


public class Menus{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int op = 0;
            

            while(op !=4){
                System.out.println("\n==== MENU ====");
                System.out.println("1. CAIXA DE PAPELÃO");
                System.out.println("2. SACOLA PLASTICA");
                System.out.println("3. EMBALAGEM DE VIDRO");
                System.out.println("4. SAIR");
                System.out.println("Digite a opção: ");
                op =sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("Item selecionado: [Caixa de papelão] ");
                        System.out.println("Ideal para transporte e armazenamento");
                    
                        break;
                    case 2:
                        System.out.println("Item selecionado: [Sacola plastica]");
                        System.out.println("Leve e prática, mas pouco sustentável");

                        break;
                    case 3:
                        System.out.println("Item selecionado: [Embalagem de vidro]");
                        System.out.println("Resistente e reutilizável1");
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