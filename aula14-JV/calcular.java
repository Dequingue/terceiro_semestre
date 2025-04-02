    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        double nota1 = Double.valueOf(jTextField1.getText());
        double nota2 = Double.valueOf(jTextField2.getText());
        
        if (nota1 >0 && nota2 >0){
            double somar;
            somar = nota1 + nota2;
         
            double sub;
            sub = nota1-nota2;
        
            double div;
            div = nota1/nota2;
        
            double mult;
            mult = nota1*nota2;
            
            
                    
            jTextField6.setText(String.valueOf(div));
            jTextField5.setText(String.valueOf(mult));
            jTextField4.setText(String.valueOf(sub));
            jTextField3.setText(String.valueOf(somar));
        }else{
            JOptionPane.showMessageDialog(null, "Systema não calcula numeros negativos ","Aviso",JOptionPane.ERROR_MESSAGE);
        }


        
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
    }   
