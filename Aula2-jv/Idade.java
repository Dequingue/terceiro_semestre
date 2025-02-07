import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Digite sua idade: ");
            int idade=sc.nextInt();

            if(idade < 18){
                System.out.println("Voçê é menor de idade ");

            }else{
                System.out.println("Voçê é maior de idade ");
            }

        }
    }
}
