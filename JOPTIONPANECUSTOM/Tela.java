import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela extends JFrame
{
 private JLabel texto;
 private JButton mostrar, limpar, sair;
 private JTextField textoo;

 public Tela(){
    super("Tela");
    texto = new JLabel("texto");
    mostrar = new JButton("mostrar");
    limpar = new JButton("limpar");
    sair = new JButton("sair");
    textoo = new JTextField("textoo");

    JPanel painelDadosEntrada = new JPanel(new GridLayout(4, 2));
    JPanel painelEntrada = new JPanel(new FlowLayout());
    texto = new JLabel("texto");
    textoo = new JTextField(10);
    painelDadosEntrada.add(texto);
    painelDadosEntrada.add(textoo);
    painelEntrada.add(painelDadosEntrada);
   
    // montando o painel dos botoes
    JPanel painelBotoes = new JPanel(new FlowLayout());
    mostrar = new JButton("Mostrar");
    limpar = new JButton("Limpar");
    sair = new JButton("Sair");
    painelBotoes.add(mostrar);
    painelBotoes.add(limpar);
    painelBotoes.add(sair);
 }
}
