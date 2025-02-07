import java.util.Scanner;

public class Idadeif {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Digite sua idade: ");
            int idade=sc.nextInt();

            if(idade != 0 && idade > 0){
              if(idade ==0 || idade <=12){
                    System.out.println("Criança");
                }else if(idade >=13 || idade <=17){
                    System.out.println("Adolecente");
                }else if(idade >=18 || idade <=59){
                    System.out.println("Adulto");
                }else if(idade >= 60 ){
                    System.out.println("Idoso");
                }
            }else{
                System.out.println("Número errado [ERRO]");
            }    
        }
    }
}
