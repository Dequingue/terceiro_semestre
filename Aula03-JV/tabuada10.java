import java.util.Scanner;

public class tabuada10 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Digite um número: ");
            int numero =sc.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(numero+" x "+i+" = "+numero*i);
                
            }

        }
    }
}