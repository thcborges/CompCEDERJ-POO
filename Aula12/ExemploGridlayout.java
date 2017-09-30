import java.awt.event.*;
import javax.swing.*;
import java.awt.Container;
import java.awt.GridLayout;


public class ExemploGridLayout extends JFrame {
    public ExemploGridLayout() {
        final JFrame janela = new JFrame("Exemplo de Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = janela.getContentPane();
        contentPane.setLayout(new GridLayout(3, 2));

        contentPane.add(new JButton("Button 1"));
        contentPane.add(new JButton("2"));
        contentPane.add(new JButton("Button 3"));
        contentPane.add(new JButton("Long-named Button 4"));
        contentPane.add(new JButton("Button 5"));

        janela.pack();
        janela.setVisible(true);
    }

    public static void main(String[] args) {
        ExemploGridLayout exemploGridLayout = new ExemploGridLayout();
    }
}