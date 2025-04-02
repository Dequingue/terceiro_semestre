 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String nome = txtNome.getName();
        String idade = txtIdade.getName();
        String endereco = txtEndereco.getName();
        
        if(nome.equalsIgnoreCase(null)|| idade.equalsIgnoreCase(null)|| endereco.equalsIgnoreCase(null)){
            JOptionPane.showMessageDialog(null,"Algo não foi preenchido!","Erro",JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        txtNome.setText("");
        txtIdade.setText("");
        txtEndereco.setText("");
    }         
