import java.util.Scanner;

public class Quantidade {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numeros[] = new int[4];
            // Recebe os números
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Digite um número: ");
                numeros[i] = sc.nextInt();
            }

            System.out.println("\nNúmeros que se repetem:");

            // Verifica os números repetidos
            for (int i = 0; i < numeros.length; i++) {
                int contador = 1;  // Começa com 1, já que o número foi encontrado uma vez

                // Verifica quantas vezes o número aparece
                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[i] == numeros[j]) {
                        contador++;  // Incrementa o contador se o número se repetir
                        numeros[j] = -1;  // Marca o número como já verificado (para não ser contado novamente)
                    }
                }

                // Se o número se repetiu mais de uma vez, imprime o número e sua quantidade
                if (contador > 1 && numeros[i] != -1) {
                    System.out.println("Número: " + numeros[i] + " | Quantidade: " + contador);
                }
            }
        }
    }
}
