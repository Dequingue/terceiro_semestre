import java.util.Scanner;

public class Imposto {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Digite seu Sálaria: ");
            float salario=sc.nextFloat();

            if (salario == 3000){
                System.out.println("Voçê é Rico");
            }else{
                System.out.println("Voçê é pobre");
            }
        }
    }
    
}
