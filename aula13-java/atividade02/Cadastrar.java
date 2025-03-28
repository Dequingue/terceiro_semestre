package atividade02;

import java.util.ArrayList;

import javax.swing.JOptionPane;
// cadastrar -listar- detalhar -fechar
public class Cadastrar {
    public static void main(String[] args) {
        ArrayList<Salvar> list = new ArrayList<>();
    
        String nome ="";
        String modelo = "";
        int anoLancado = 0 ; 
        int opcao = 0;

        while(opcao !=4){

            String op = JOptionPane.showInputDialog(null
            ,"1- Cadastrar\n2- Listar\n3- Detalhar\n4- Fechar","MENU"
            ,JOptionPane.QUESTION_MESSAGE);


            opcao = Integer.parseInt(op);
            // nome - modelo - ano
            switch (opcao) {
                case 1:
                    nome = JOptionPane.showInputDialog("Informe o nome: ");
                    modelo = JOptionPane.showInputDialog("Informe o modelo: ");
                    String ano =JOptionPane.showInputDialog("Informe o ano Lançado: ");

                    anoLancado = Integer.parseInt(ano);

                    int resposta = JOptionPane.showConfirmDialog(null
                    , "Deseja salvar cadastro?", 
                    "Confimação"
                    ,JOptionPane.WARNING_MESSAGE);

                    if(resposta == JOptionPane.YES_NO_OPTION){
                        JOptionPane.showMessageDialog(null
                        ,"Voçê escolheu SIM!"
                        ,"Informação"
                        ,JOptionPane.WARNING_MESSAGE);

                        list.add(new Salvar(nome, modelo, anoLancado));
                    }else{
                        JOptionPane.showMessageDialog(null
                        ,"Voçê escolheu NÃO !"
                        ,"Informação"
                        ,JOptionPane.WARNING_MESSAGE);

                        JOptionPane.showMessageDialog(null
                        ,"Volte para o MENU"
                        ,"Infomação"
                        ,JOptionPane.PLAIN_MESSAGE);
                    }

                    break;
                case 2:
                    if(list.isEmpty()){
                        JOptionPane.showMessageDialog(null
                        ,"Lista Vazia!"
                        ,"Informação"
                        ,JOptionPane.WARNING_MESSAGE);
                    }else{
                        for (int i = 0; i < list.size();i++) {
                            Salvar sv = list.get(i);
                            JOptionPane.showMessageDialog(null
                            , "Indice: "+i+"\nNome: "+sv.getNome()
                            ,"Registro"
                            ,JOptionPane.PLAIN_MESSAGE);
                            
                        }
                    }
                    break;
                case 3:
                    if(list.isEmpty()){
                        JOptionPane.showMessageDialog(null
                        ,"Lista Vazia!"
                        ,"Informação"
                        ,JOptionPane.WARNING_MESSAGE);
                    }else{
                        for (int i = 0; i < list.size();i++) {
                            Salvar sv = list.get(i);
                            JOptionPane.showMessageDialog(null
                            , "Indice: "+i+
                            "\nNome: "+sv.getNome()+
                            "\nModelo: "+sv.getModelo()+
                            "\nAno Lançado: "+sv.getAnoLancado()
                            ,"Registro"
                            ,JOptionPane.PLAIN_MESSAGE);
                        
                        }
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null
                    , "Fechando o Systema....."
                    ,  "Systema"
                    , JOptionPane.PLAIN_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null
                    , "Erro"
                    , "Systema"
                    , JOptionPane.ERROR_MESSAGE);
                    break;
                    
            }
        }
    }
}
