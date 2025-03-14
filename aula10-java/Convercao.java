import java.util.Scanner;

public class Convercao {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String valor;
            int numero=0;

            System.out.println("Digite um valor:");
            valor = sc.next();
            try{
                numero =  Integer.parseInt(valor);
            }catch(NumberFormatException e){
                System.out.println("Erro: não foi possivel converter a String");
                
            }finally{
                

                System.out.println("Número convertido: "+numero);
                
            }
        }
    }
    
}
