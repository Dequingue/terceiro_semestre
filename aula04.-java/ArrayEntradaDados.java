import java.util.Scanner;


public class ArrayEntradaDados {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){


            //Definindo o tamanho do array
            System.out.println("Quantos nomes deseja inserir?: ");
            int tamanho = sc.nextInt();
            sc.nextLine();//Consumir a quebra de linha

            //Criando a array com o tamanho informado peo usuario
            String[] nomes = new String[tamanho];

            //Preenchendo o array com os nomes digitados
            for(int i = 0; i < nomes.length; i ++){
                System.out.println("Digite o nome "+(i+1)+": ");
                nomes[i] = sc.nextLine();
            }

            //Exibindo os nomes armazenados no array
            System.out.println("\nNomes digitados: ");
            for(int i = 0; i < nomes.length; i++){
                System.out.println("Nome na posição "+i+": "+nomes[i]);

            }
        }
    }
    
}
