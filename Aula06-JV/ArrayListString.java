
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[] args) {
        //Criando um Scanner para a entrada de dados
        try(Scanner scanner=new Scanner(System.in)){
            //criando um ArrayList para armazenar as strings
            ArrayList<String> lista = new ArrayList<>();

            //solicitando ao usuario que insira uma string
            System.out.println("Insira uma string: ");
            String entrada = scanner.nextLine();

            //Adicionando a string a lista
            lista.add(entrada);

            //Exibindo a lista
            System.out.println("Elementos da lista:");
            for(String elemento : lista){
                System.out.println(elemento);
            }
        }
    }
}
