import java.util.Scanner;

public class Entrada2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            double n1=sc.nextDouble();
            
            System.out.println("Digite o segundo número: ");
            double n2=sc.nextDouble();
            
            System.out.println("Digite o terceiro número: ");
            double n3=sc.nextDouble();

            double soma =n1+n2+n3;
            double multi = n1*n2;
            double div = n1/n2;
            double media = soma/3;

            System.out.println(soma);
            System.out.println(multi);
            System.out.println(div);
            System.out.println(media);
            
        }
    }
    
}

