import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){

            System.out.println("Digite sua nota: ");
            double nota=sc.nextDouble();

            if(nota >= 7 ){
                System.out.println("Voçê foi aprovado!!");
            }else{
                System.out.println("Voçê foi reprovado!!");
            }


        }
    }    
}
