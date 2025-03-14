import java.util.Scanner;
public class Divisao {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            float dividir = 0;
            int valor2 = 0;
            int valor1=0;
            
            System.out.println("Digite o 1º valor: ");
            valor1 = sc.nextInt();

            System.out.println("Digite o 2º valor: ");
            valor2= sc.nextInt();
            try{
    
                dividir = valor1/valor2;
                
            }catch(ArithmeticException e){
                System.out.println("[Erro] não é possivel divisão por 0 no segundo valor valor");
            }finally{
                if(valor2 != 0){

                    System.out.println("Esse é o resultado: "+dividir);
                }
            }


        }
    }
}
