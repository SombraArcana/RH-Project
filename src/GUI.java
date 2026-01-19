import javax.swing.*; 
import java.awt.*;    
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel panel1;
    private JButton button1;
    private JLabel labelContador;

    public GUI() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = labelContador.getText();
                int valorAtual = Integer.parseInt(texto);
                int novoValor = valorAtual + 5;
                labelContador.setText(String.valueOf(novoValor));
            }
        });
    }

    public JPanel getRootPanel() {
        return panel1; 
    }
}
