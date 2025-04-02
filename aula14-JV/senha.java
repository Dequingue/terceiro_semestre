    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String usuario = txtUsuario.getText();
        String senha = new String(txtSenha.getPassword());
        
        if(usuario.equals("admin")&& senha.equals("1234")){
            JOptionPane.showMessageDialog(null, "Login Bem-sucedido");
        }else{
            JOptionPane.showMessageDialog(null,"Usuário ou senha incorretos!","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        txtUsuario.setText("");
        txtSenha.setText("");
    } 
