import java.awt.event.*;
import javax.swing.*;


public class ExemploLabel extends JFrame {
    public ExemploLabel() {
        /*  Cria um label com texto */
        final JLabel label1 = new JLabel("Label1: Apenas Texto");

        /* Cria label com texto e imagem */
        final JLabel label2 = new JLabel(
                "Label2: Imagem e texto",
                new ImageIcon("Java-icon.png"),
                JLabel.CENTER
                );

        label2.setVerticalTextPosition(JLabel.BOTTOM);
        label2.setHorizontalTextPosition(JLabel.CENTER);

        final JFrame janela = new JFrame("Janela Simples");  // janela
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(500, 350);

        JPanel painel = new JPanel();  // adiciona componentes
        painel.add(label1);
        painel.add(label2);
        janela.getContentPane().add(painel);

        janela.setVisible(true);  // Exibe a janela
    }

    public static void main(String[] args) {
        ExemploLabel exemploLabel = new ExemploLabel();
    }
}