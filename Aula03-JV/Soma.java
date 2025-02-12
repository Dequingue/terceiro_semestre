import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in) ){
            int op = 0;
            

            System.out.println("Digite um valor: ");
            double valor1 = sc.nextDouble();

            System.out.println("Digite outro valor: ");
            double valor2= sc.nextDouble();

            while(op !=5){
                   
                System.out.println("\n==== MENU ====");
                System.out.println("1. SOMA");
                System.out.println("2. SUBTRAÇÃO");
                System.out.println("3. MULTIPICAÇÃO");
                System.out.println("4. DIVISÃO");
                System.out.println("5. SAIR");
                System.out.println("Digite a opção: ");
                op =sc.nextInt();

                switch (op) {
                    case 1:
                        double somar = valor1 + valor2;
                        System.out.println("A soma de: "+valor1+" e "+valor2+" é: "+somar);
                        break;
                    case 2:
                        double sub= valor1-valor2;
                        System.out.println("A subtração de: "+valor1+" e "+valor2+" é: "+sub);
                        break;
                    case 3:
                        double multi= valor1*valor2;
                        System.out.println("A multiplicação de: "+valor1+" e "+valor2+" é: "+multi);
                        break;
                    case 4:
                        double div=valor1/valor2;
                        System.out.println("A divisão de: "+valor1+" e "+valor2+" é: "+div);
                        break;    
                    case 5:
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
