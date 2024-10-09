import javax.swing.*;
import java.awt.*;

public class Mudandofont_JP
  {
    public static void main(String[] args)
    {
        // Cria um painel
        JPanel panel = new JPanel();
        
        // Cria um JLabel e define a fonte
        JLabel label = new JLabel("Mensagem com fonte personalizada:");
        label.setFont(new Font("Serfig", Font.ITALIC, 24)); // Define a fonte desejada
        
        // Adiciona o JLabel ao painel
        panel.add(label);
        
        // Exibe o JOptionPane com o painel personalizado
        JOptionPane.showMessageDialog(null, panel, "Título do Dialog", JOptionPane.INFORMATION_MESSAGE);
    }
}


/*Onde posso consultar mais nomes de fontes?
  Segue:
  Documentação do Java:
A documentação oficial do Java lista as classes relacionadas a fontes e pode oferecer insights sobre como usá-las.*/
