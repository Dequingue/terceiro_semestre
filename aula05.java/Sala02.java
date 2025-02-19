import java.util.Scanner;

public class Sala02{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int tamanho = 2;
            int contador =0;
            int[] numeros = new int[tamanho];
            int opcao = 0;
            while (opcao != 4) {
                System.out.println("\t===== Menu =====\n");
                System.out.println("1.Inserir números");
                System.out.println("2.Alterar números");
                System.out.println("3.Exibir valores");
                System.out.println("4.Fechar o systema\n");
                System.out.println("Digite qual opção você deseja: "); 
                opcao =sc.nextInt();   
                
                switch (opcao) {
                    case 1:
                        for(int i=0; i <numeros.length; i++){
                            System.out.println("Digite o "+(i+1)+"º número: ");
                            numeros[i]=sc.nextInt();
                            contador= contador +1;
                            if(contador == tamanho ){
                                System.out.println("\nQuantidade de números cheia!!\n");
                            }
        
                        }

                        break;
                    case 2:
                        System.out.println("Escolha qual valor que deseja mudar: ");
                        int escolha = sc.nextInt();
                        for(int i =0; i < numeros.length; i++){
                            if(escolha == i){
                                System.out.println("Qual o número de sua escolha: ");
                                numeros[i] = sc.nextInt();     
                            }
                            
                        }
                    
                        break;
                    case 3:
                        for(int i =0; i < numeros.length; i++){
                            System.out.println("\nEsses são os valores: "+numeros[i]+" Posição: "+i);
                        }
                        break;
                    case 4:
                        System.out.println("Fechando o Systema......");
                        break;    
                    default:
                        System.out.println("\n[ERRO]");
                        break;
                }

            }
            


            
            

         
            
        }
    }
}