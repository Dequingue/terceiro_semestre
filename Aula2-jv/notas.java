import java.util.Scanner;



public class notas {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("Digite sua nota: ");
            double nota1=sc.nextDouble();

            System.out.println("Digite sua nota: ");
            double nota2=sc.nextDouble();

            double somar = nota1 + nota2;
            double media = somar /2;

            System.out.println("O valor da media é: "+media);
        }
    }    
}
