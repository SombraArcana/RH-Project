import javax.swing.*; 
import java.awt.*;    
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private static int numeroAtual = 0;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Contador +3");
        frame.setSize(300, 200); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLayout(new FlowLayout()); 

        JLabel labelNumero = new JLabel("Número: " + numeroAtual);
        labelNumero.setFont(new Font("Arial", Font.BOLD, 24)); 

        
        JButton botaoSomar = new JButton("Somar +3");
        botaoSomar.setFont(new Font("Arial", Font.PLAIN, 16));


        botaoSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                numeroAtual = numeroAtual + 3;


                labelNumero.setText("Número: " + numeroAtual);
            }
        });


        frame.add(labelNumero);
        frame.add(botaoSomar);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}