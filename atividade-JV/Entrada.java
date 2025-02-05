
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite sua idade: ");
            
            int idade = sc.nextInt();
            
            System.out.println("Digite seu nome: ");
            
            String nome = sc.next();
            
            
            System.out.println("Olá, "+nome+ " sua idade é "+idade);
        }
    }
    
}
