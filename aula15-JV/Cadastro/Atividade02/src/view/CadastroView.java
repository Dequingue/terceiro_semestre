package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.util.*;
import java.util.List;
import java.awt.*;
import java.awt.event.*;

import controle.ControleCadastro;
import controle.ControleCadastro;
import modelo.Usuario;

public class CadastroView extends JFrame {
    private JTextField campoLogin;
    private JPasswordField campoSenha;
    private JButton botaoEntrar;
    private ControleCadastro controlecd;
    
    

    public CadastroView() {
        super("Tela de Cadastro");
        controlecd = new ControleCadastro(); // cria o controlador

        // Layout de 3 linhas e 2 colunas
        setLayout(new GridLayout(3, 2, 10, 10));

        campoLogin = new JTextField();
        campoSenha = new JPasswordField();
        botaoEntrar = new JButton("Entrar");

        add(new JLabel("Login:"));
        add(campoLogin);
        add(new JLabel("Senha:"));
        add(campoSenha);
        add(new JLabel(""));
        add(botaoEntrar);

        // Ação do botão "Entrar"
        botaoEntrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String logincd = campoLogin.getText();
                String senhacd = new String(campoSenha.getPassword());


                // Chama o controller para autenticar
                if (controlecd.autenticar(logincd, senhacd)) {
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                } else {
                    JOptionPane.showMessageDialog(null, "Login inválido.");
                }
            }
        });

        setSize(300, 150);
        setLocationRelativeTo(null); // centraliza a janela
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); // mostra a janela
    }
   
}


