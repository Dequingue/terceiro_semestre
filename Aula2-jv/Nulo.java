import java.util.Scanner;

public class Nulo{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Digite um número: ");
            int num= sc.nextInt();

            if (num == 0){
                System.out. println("O número: "+num+", é nulo. ");
            }else if(num>0){
                System.out. println("O número: "+num+", é positivo.");
            }else{
                System.out. println("O número: "+num+", é negativo. ");
            }
        }
    }

}