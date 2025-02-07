import java.util.Scanner;


public class Par {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){

            System.out.println("Digite um numero: ");
            int num = sc.nextInt();

            if(num %2 ==0){
                System.out.println("O valor: "+num+", é par");
            }else{
                System.out.println("O valor: "+num+", é impar");
            }

        }
    }
    
}
