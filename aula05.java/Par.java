import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int[]numeros = new int[4];

            for(int i =0; i< numeros.length; i++){
                System.out.println("Digite um número: ");
                numeros[i] = sc.nextInt();


            }

            for(int i =0; i< numeros.length; i++){
                if(numeros[i] %2 == 0){
                    System.out.println("Esses são pares: "+numeros[i]);
                }
                else if(numeros[i] %2 != 0){
                    System.out.println("Esses são Impares: "+numeros[i]);
                }

            }

        }
    }
}
