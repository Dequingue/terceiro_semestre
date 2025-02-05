import java.util.Scanner;

public class Questao2{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Encontre o valor de T(Trablho)");

            System.out.println("Digite o valor da Força: ");
            double f=sc.nextDouble();

            System.out.println("Digite o valor da Distancia: ");
            double d=sc.nextDouble();

            double resultado = f*d;

            System.out.println("O resultado de T é: "+resultado);


        }
    }

}    