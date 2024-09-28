import javax.swing.*;
import java.awt.Color;

public class CustomJOptionPane {
    public static void main(String[] args) 
    {
        // Define a cor de fundo do JOptionPane usando valores RGB para rosa claro
        UIManager.put("Panel.background", new Color(237, 160, 222)); // Rosa claro
        UIManager.put("OptionPane.background", new Color(237, 160, 222));
        UIManager.put("Button.background", Color.LIGHT_GRAY); // Cor dos botões

        // Exibe um JOptionPane
        JOptionPane.showMessageDialog(null, "Esta é uma janela com fundo rosa claro!", "Título", JOptionPane.INFORMATION_MESSAGE);
    }
}



/*use a numeração RGB apresentada, você pode consultar no site da HTML Colors Code.*/
