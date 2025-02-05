
import java.util.Locale;

public class Numeros {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        double soma = a+b;
        double multi = a*b;
        double div = a/b;

        /*
         System.out.printf("multi=%.2f%n",x);
         */
        System.out.println("A soma de "+a+" com "+b+" é: "+soma);
        System.out.println("A multipicação de "+a+" com "+b+" é: "+multi);
        System.out.println("A divisão de "+a+" com "+b+" é: "+div);
        Locale.setDefault(Locale.US);
    }
}
