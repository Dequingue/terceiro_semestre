import java.util.Scanner;
import java.util.ArrayList;

public class RoupaApp {
    public static void main(String[] args) {

        ArrayList<Roupa>list=new ArrayList<>();

        try(Scanner sc= new Scanner(System.in)){
            int op =0;

            while (op !=3) {
                System.out.println("\n ==== MENU ====");
                System.out.println("1-CADASTRAR");
                System.out.println("2-LISTAR");
                System.out.println("3-FECHAR APP");
                System.out.println("Escolha a opção: ");
                op=sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("Informe a cor da roupa: ");
                        String cor = sc.next();

                        System.out.println("Informe o tamanho da roupa: ");
                        String tamanho = sc.next();

                        System.out.println("Informe tipo do tecido: ");
                        String tipo = sc.next();

                        list.add(new Roupa(cor, tamanho, tipo));

                        break;
                    case 2:
                        if(list.isEmpty()){
                            System.out.println("Lista vazia");
                        }else{
                            for (Roupa r : list) {
                                System.out.println("Cor: "+r.getCor()+"\nO tamnho é: "+r.getTamanho()+"\nE seu tipo é: "+r.getTipo());
                            }
                        }

                        break;
                    case 3:
                        System.out.println("Systema Fechado.......");
                        break;

                    default:
                        System.out.println("Opção invalida!!!");
                        break;
                }

            }
        }
    }

    
}


