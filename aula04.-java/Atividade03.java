import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int[]numeros = new int[2];

            int maior = 0;
            int menor = 9999;
            
            for(int i = 0; i < numeros.length; i++){
                System.out.println("Digite o "+(i+1)+"º número: ");
                numeros[i] = sc.nextInt();

                if(numeros[i] > maior){
                    maior = numeros[i];
                }
                if(numeros[i] < menor){
                    menor = numeros[i];
                }

            }
            System.out.println("Quantidade maior: "+maior);
            System.out.println("Quantidade menor: "+menor);

        }
    }    
}
