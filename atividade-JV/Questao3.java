import java.util.Scanner; 

public class Questao3 {
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)) {
            System.out.println("Encontre o IMC");

            System.out.println("Digite seu Peso: ");
            double peso=sc.nextDouble();

            // Verifica se o peso é válido
            if (peso <= 0) {
                System.out.println("Peso inválido.");
                return;
                
            }

            System.out.println("Digite sua Altura: ");
            double altura=sc.nextDouble();

            if (altura <= 0) {
                System.out.println("Altura inválida.");
                return;
            }

            double imc = peso/(altura*altura);


            System.out.println("O IMC é: "+imc);
        }
    }
}
