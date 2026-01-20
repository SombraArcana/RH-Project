import javax.swing.*;

public class GUI {
    private JPanel painel1;
    private JButton button1;
    private JLabel labelContador;

    public GUI() {
        // this.labelContador = labelContador;
        // this.button1 = button1;
        // this.painel1 = painel1;

        labelContador.setText("0");

        button1.addActionListener(e -> {
            int valor = Integer.parseInt(labelContador.getText());
            labelContador.setText(String.valueOf(valor + 5));
        });

        JFrame frame = new JFrame("App nada indicado");
        frame.setContentPane(painel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

