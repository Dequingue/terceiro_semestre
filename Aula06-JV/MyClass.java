import java.util.Scanner;
import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            ArrayList<String> nomes = new ArrayList<>();

            nomes.add("Anderson");
            nomes.add("bob");
            nomes.add("carol");

            //listando todos os objetos da lista
            System.out.println("Primeiro nomes: "+nomes);

            //acessando o elemento pelo indice
            System.out.println(nomes.get(0));

            //Iteração sobre os elementos
            for (String nome : nomes) {
                System.out.println(nome);
            }
            //removendo elementos
            nomes.remove("bob");
            System.out.println("Após remoção a lista é: "+nomes);
        }
    }
}
