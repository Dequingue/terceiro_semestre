package view;

    
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JOptionPane;
    import javax.swing.JTextField;


    import java.awt.*;
    import java.awt.event.*;

    import controle.CadastroController;

public class CadastroView extends JFrame {

    private JTextField campoCadastro;
    private JButton botaoEntrar;
    private CadastroController controle;
    
    private JTextField campoMarca;
    private JTextField campoModelo;
    private JTextField campoNPortas;
    private JTextField campoCilindrada;

    public CadastroView() {
        super("Tela de Cadastro");
        controle = new CadastroController(); // cria o controlador

        // Layout de 3 linhas e 2 colunas
        setLayout(new GridLayout(5, 5, 10, 10));

     
        campoMarca = new JTextField();
        campoModelo = new JTextField();
        campoNPortas = new JTextField();
        campoCilindrada = new JTextField();
        botaoEntrar = new JButton("Cadastrar");

        add(new JLabel("Marca:"));
        add(campoMarca);
        add(new JLabel("Modelo:"));
        add(campoModelo);
        add(new JLabel("N Portas:"));
        add(campoNPortas);
        add(new JLabel("Cilindrada:"));
        add(campoCilindrada);
        add(new JLabel("")); // Espaço vazio
        add(botaoEntrar);


        // Ação do botão "Entrar"
        botaoEntrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String marca = campoCadastro.getText();
                String modelo = campoCadastro.getText();
                String nPortas = campoCadastro.getText();
                String Cilindrada = campoCadastro.getText();

                // Chama o controller para autenticar
                if (controle.autenticar(marca,modelo,nPortas,Cilindrada)) {
                    JOptionPane.showMessageDialog(null, "Cadastro bem-sucedido!");
                } else {
                    JOptionPane.showMessageDialog(null, "Cadastro inválido.");
                }

                
            }
        });

        setSize(400, 250);
        setLocationRelativeTo(null); // centraliza a janela
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); // mostra a janela
    }
   
}
    

