
import java.util.Scanner;

public class Questao {
    public static void main(String[] args) {
        
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("Digite uma palavra: ");
            String p1=sc.next();

            System.out.println("Digite outra palavra: ");
            String p2=sc.next();


            System.out.print(p1);
            System.out.print(p2);

        }
    }
    
}
