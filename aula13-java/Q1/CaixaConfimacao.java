package Q1;

import javax.swing.JOptionPane;

public class CaixaConfimacao {
    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?"
        , "Confimação", JOptionPane.YES_NO_OPTION);

        if(resposta == JOptionPane.YES_NO_OPTION){
            JOptionPane.showMessageDialog(null, "Você escolheu SIM!"
            , "Resultado",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Você escolheu NÃO"
            , "Resultado", JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
