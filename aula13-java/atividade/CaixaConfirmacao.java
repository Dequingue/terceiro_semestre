package atividade;

import javax.swing.JOptionPane;

public class CaixaConfirmacao {
    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(null
        , "Deseja continuar?"
        , "Confirmação",JOptionPane.YES_NO_OPTION);

        if(resposta == JOptionPane.YES_NO_OPTION){
            JOptionPane.showMessageDialog(null
            , "Voçê escolheu SIM!"
            , "Resultado"
            , JOptionPane.WARNING_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null
                , "Voçê escolheu NÃO!"
                , "Resultado"
                , JOptionPane.WARNING_MESSAGE);
        }
    }
}
