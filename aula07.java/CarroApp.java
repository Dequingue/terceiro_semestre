import java.util.Scanner;
import java.util.ArrayList;

public class CarroApp {
    public static void main(String[] args) {
        
        ArrayList<Carro>list=new ArrayList<>();
        
        
        try(Scanner sc=new Scanner(System.in)){
            int op=0;
                        
            while (op !=3) {
                System.out.println("==== MENU ====");
                System.out.println("1.CADASTRE ");
                System.out.println("2.LISTA");
                System.out.println("3.FECHAR");
                System.out.println("Escolha uma opção: ");
                op = sc.nextInt();
                

                switch (op) {
                    case 1:
                        System.out.println("Iforme a marca do veiculo: ");
                        String marca = sc.next();
                        System.out.println("Iforme o modelo do veiculo: ");
                        String modelo = sc.next();
                        System.out.println("Iforme o ano de Fabricação: ");
                        Integer anoFabricado = sc.nextInt();

                        list.add(new Carro(marca, modelo, anoFabricado));

                        break;
                    case 2:
                        if(list.isEmpty()){
                            System.out.println("Lista vazia");
                        }else{
                            for (Carro carro : list) {
                                System.out.println("marca: "+carro.getMarca()+"\nModelo: "+carro.getModelo()+"\nAno de Fabricação: "+carro.getAnoFabricado());
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Systema Encerrado......"); 
                        break;
                    default:
                        System.out.println("Erro!!!!");
                        break;
                }

            }

        }


    }
}
