import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListSimples{

    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in)){

            //Criando um array list de inteiros
            ArrayList <Integer> numeros = new ArrayList<>();
            // Adicionando elementos ao array List
            numeros.add(10);
            numeros.add(20);
            numeros.add(30);

            // Exibindo os elementos do arraylist
            System.out.println("Elementos do ArrayList de inteiros: ");
            for(Integer numero : numeros){
                System.out.println(numero);

                //Exibindo os elementos do ArrayList
                System.out.println("Elementos do ArrayList de inteiros: "+ numeros);

            }
            // Verificando o tamanho do ArrayList
            int tamanho = numeros.size();
            System.out.println("Tamanho do ArrayList: "+tamanho);

            //Verificando a existencia de um elemento
            boolean existeElemento30 = numeros.contains(30);
            System.out.println(("Existe o elemento 30? "+existeElemento30));

            //Removendo um elemento
            numeros.remove(Integer.valueOf(30));// Removendo o valor 30
            System.out.println("Após a remoção do elemento 30: ");
            for(Integer numero : numeros){
                System.out.println(numero);
            }


        }
    }

}