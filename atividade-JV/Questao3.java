import java.util.Scanner; 

public class Questao3 {
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)) {
            System.out.println("Encontre o IMC");

            System.out.println("Digite seu Peso: ");
            float peso=sc.nextFloat();

            // Verifica se o peso é válido
            if (peso <= 0) {
                System.out.println("Peso inválido.");
                return;
                
            }

            System.out.println("Digite sua Altura: ");
            float altura=sc.nextFloat();

            if (altura <= 0) {
                System.out.println("Altura inválida.");
                return;
            }

            float imc = peso/(altura*altura);


            System.out.printf("O IMC é: %.2f%n",imc);
        }
    }
}
