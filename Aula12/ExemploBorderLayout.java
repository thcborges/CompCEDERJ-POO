import java.awt.event.*;
import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.BorderLayout;


public class ExemploBorderLayout extends JFrame {
    public ExemploBorderLayout() {
        final JFrame janela = new JFrame("Exemplo de Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = janela.getContentPane();

        contentPane.add(new JButton("Button 1 (NORTH)"), BorderLayout.NORTH);
        contentPane.add(new JButton("2 (CENTER)"), BorderLayout.CENTER);
        contentPane.add(new JButton("Button 3 (WEST)"), BorderLayout.WEST);
        contentPane.add(new JButton("Long-named Button 4 (SOUTH)"), BorderLayout.SOUTH);
        contentPane.add(new JButton("Button 5 (EAST)"), BorderLayout.EAST);

        janela.pack();
        janela.setVisible(true);
    }

    public static void main(String[] args) {
        ExemploBorderLayout exemploBorderLayout = new ExemploBorderLayout();
    }
}