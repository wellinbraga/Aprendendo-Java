package exercicios;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
 
public class Login extends JFrame{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public Login(){
    super("Tela de login usando GridBagLayout");
 
    // define o layout
    setLayout(new GridBagLayout());
     
    // define uma borda para aumentar o espa�o
    // entre as bordas da janela e o gerenciador
    // de layout
    ((JComponent)getContentPane()).setBorder(
       new EmptyBorder(5, 8, 8, 8));
 
    // cria o GridBagConstraints
    GridBagConstraints gbc = new GridBagConstraints();
 
    // controla o espa�o entre os componentes
    // e as linhas do GridBagLayout.
    // aqui n�s definimos 2 pixels para os
    // lados de cima, esquerda, inferior e direita
    gbc.insets = new Insets(2, 2, 2, 2);
 
    // adiciona componentes � janela
    // esta primeira JLabel ocupar� duas c�lulas
    // na primeira linha
    gbc.gridy = 0; // linha
    gbc.gridx = 0; // coluna
    gbc.gridwidth = 3; // duas c�lulas na linha
    // alinha o label � esquerda
    gbc.anchor = GridBagConstraints.WEST;
    JLabel infoLabel = new JLabel("Dados do Usu�rio:");
    // vamos aumentar a fonte da JLabel
    infoLabel.setFont(new Font("SansSerif", 
      Font.BOLD, 14));
    // vamos adicionar um espa�o extra na parte
    // inferior da JLabel
    infoLabel.setBorder(
      new EmptyBorder(0, 0, 5, 0));
     
    add(infoLabel, gbc);
 
    gbc.gridy = 1; // linha
    gbc.gridx = 0; // coluna
    gbc.gridwidth = 1;
    // cria a label do usu�rio
    JLabel usuarioLabel = new JLabel("Usu�rio:");
    add(usuarioLabel, gbc);
 
    gbc.gridy = 1; // linha
    gbc.gridx = 1; // coluna
    // cria a JTextField do usu�rio
    JTextField usuarioTxt = new JTextField(13);
    add(usuarioTxt, gbc);
 
    gbc.gridy = 2; // linha
    gbc.gridx = 0; // coluna
    // cria a label da senha
    JLabel usuarioSenha = new JLabel("Senha:");
    add(usuarioSenha, gbc);    
     
    gbc.gridy = 2; // linha
    gbc.gridx = 1; // coluna
    // cria a JPasswordField da senha
    JPasswordField senhaTxt = new JPasswordField(13);
    add(senhaTxt, gbc);
 
    gbc.gridy = 3; // linha
    gbc.gridx = 1; // coluna
    gbc.gridwidth = 2; // duas c�lulas na linha
    // alinha os bot�es � direita
    gbc.anchor = GridBagConstraints.EAST;
    JPanel botoesPanel = new JPanel();
    botoesPanel.add(new JButton("Cancelar"));
    botoesPanel.add(new JButton("OK"));
    add(botoesPanel, gbc);
 
    pack(); // ajusta o tamanho da janela ao
            // dos componentes
    setVisible(true);    
  }
 
  public static void main(String args[]){
	  Login app = new Login();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
