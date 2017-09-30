import java.awt.event.*;
import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;


public class ExemploFlowLayout extends JFrame {
    public ExemploFlowLayout() {
        final JFrame janela = new JFrame("Exemplo de Janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = janela.getContentPane();
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JButton("Button 1"));
        contentPane.add(new JButton("2"));
        contentPane.add(new JButton("Button 3"));
        contentPane.add(new JButton("Long-named Button 4"));
        contentPane.add(new JButton("Button 5"));

        janela.pack();
        janela.setVisible(true);
    }

    public static void main(String[] args) {
        ExemploFlowLayout exemploFlowLayout = new ExemploFlowLayout();
    }
}