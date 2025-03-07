import java.util.Scanner;
import java.util.ArrayList;

public class ArApp {
    public static void main(String[] args) {
        ArrayList<ControleAr>list=new ArrayList<>();

        try(Scanner sc = new Scanner(System.in)){
            int op = 0;

            while (op !=3) {
                System.out.println("===== MENU =====\n");
                System.out.println("1- CADASTRAR");
                System.out.println("2-EXIBIR");
                System.out.println("3-FECHAR");
                System.out.println("Escolha uma opção: ");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("Informe o modelo:");
                        String modelo = sc.next();

                        System.out.println("Informe o codigo do produto:");
                        String codigo = sc.next();

                        System.out.println("Informe a marca:");
                        String marca = sc.next();

                        System.out.println("Informe a btu:");
                        double btu = sc.nextDouble();

                        System.out.println("Informe o defeito:");
                        String defeito = sc.next();

                        System.out.println("Especifique o defeito:");
                        String especificarDef = sc.next();

                        list.add(new ControleAr(modelo,codigo,marca,btu,defeito,especificarDef));
                        break;
                    case 2:
                        if(list.isEmpty()){
                            System.out.println("Lista vazia");
                        }else{
                            for (ControleAr control : list) {
                                System.out.println("\nModelo: "+control.getModelo()+"\nCodigo: "+control.getCodigo()+
                                "\nMarca: "+control.getMarca()+"\nBTU: "+control.getBtu()+"\nDefeito: "+control.getDefeito()+
                                "\nEspecificação do defeito: "+control.getEspecificarDef());
                            }
                        }

                        break;
                    case 3:
                        System.out.println("Systema fechado....");     
                        break;
                    default:
                    System.out.println("[Erro] opção invalida!!!");
                        break;
                }
            }

        }
    }    
}
