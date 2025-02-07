import java.util.Scanner;



public class Teste{
    
    public static void main(String[] args) {
        String os = System.getProperty("os.name").toLowerCase();
        try {
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Digite um número: ");
            double valor = sc.nextDouble();

            if (valor >0){
                System.out.println("Esse é o valor: "+valor+", ele é positivo");

            }else{
                System.out.println("Esse é o valor: "+valor+", ele é negativo");
            }
        


        }
    }

}