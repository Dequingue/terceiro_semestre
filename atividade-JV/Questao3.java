import java.util.Scanner; 

public class Questao3 {
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)) {
            System.out.println("Encontre o IMC");

            System.out.println("Digite seu Peso: ");
            double p=sc.nextDouble();

            System.out.println("Digite sua Autura: ");
            double a=sc.nextDouble();

            double imc = p/(a*a);

            System.out.println("O IMC é: "+imc);
        }
    }
}
