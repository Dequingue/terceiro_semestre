import java.util.Scanner;

public class AtividadeMedia {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int[]numeros = new int[2];
            double somar=0;
            double media=0;
            int i=0;
            for(i = 0; i < numeros.length; i++){
                System.out.println("Digite o número "+(i+1)+": ");
                numeros[i]=sc.nextInt();
                somar+=numeros[i];
                media = somar/2;
            }
            System.out.println("A soma é: "+somar);
            System.out.println("A media é: "+media);
        }
    }
}
