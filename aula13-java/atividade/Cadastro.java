package atividade;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cadastro {
    public static void main(String[] args) {
        ArrayList<Salvar> list = new ArrayList<>();
        int opcao = 0;
        int numero = 0 ;
        String nome ="";
        while (opcao !=3) {
            
        
            String op = JOptionPane.showInputDialog(null
            ,"1- cadastrar\n2- Listar\n3- Fechar","MENU",JOptionPane.QUESTION_MESSAGE);
       
        
        

            opcao = Integer.parseInt(op);

            switch (opcao) {
                case 1:
                    nome = JOptionPane.showInputDialog("Digite seu Nome: ");
                    String idade = JOptionPane.showInputDialog("Digite sua idade: ");
        
                    numero = Integer.parseInt(idade);
        
                    int resposta = JOptionPane.showConfirmDialog(null
                    , "Deseja salvar?"
                    , "Confirmação",JOptionPane.YES_NO_OPTION);
        
                    if(resposta == JOptionPane.YES_NO_OPTION){
                        JOptionPane.showMessageDialog(null
                        , "Voçê escolheu SIM!"
                        , "Resultado"
                        , JOptionPane.WARNING_MESSAGE);
                    
                        
                        list.add(new Salvar(nome, numero));
                    
                    }else{
                        JOptionPane.showMessageDialog(null
                            , "Voçê escolheu NÃO!"
                            , "Resultado"
                            , JOptionPane.WARNING_MESSAGE);
        
                        JOptionPane.showMessageDialog(null
                        , "Volte para o MENU"
                        , "Resultado"
                        , JOptionPane.PLAIN_MESSAGE);
                    }
                
                    break;
                    
                case 2:
                    if(list.isEmpty()){
                        JOptionPane.showMessageDialog(null
                        , "Lista Vazia!"
                        ,"Systema"
                        ,JOptionPane.WARNING_MESSAGE);
                    }else{

                        for (Salvar sv : list) {
                            
                            JOptionPane.showMessageDialog(null
                            ,"Esse é o nome registrado: "+sv.getNome()+
                            "\nEssa e a idade: "+sv.getIdade()
                            ,"Registro",JOptionPane.PLAIN_MESSAGE);
                        }
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null
                    , "Fechando o Systema....."
                    ,   "Systema"
                    , JOptionPane.PLAIN_MESSAGE);
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null
                    , "Erro"
                    ,  "Systema"
                    , JOptionPane.ERROR_MESSAGE);
                    break;
            }






        }
    }
    
}
