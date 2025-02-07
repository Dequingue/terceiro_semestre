import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Digite sua Senha: ");
            String senha = sc.next();

    
            if (!senha.equals("alfa")){
                System.out.println("Porta fechada!!!");
            }else{
                System.out.println("Bem vindo!!!");
            }


        }
    }
}
