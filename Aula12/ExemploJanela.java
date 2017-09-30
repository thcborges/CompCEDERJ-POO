import java.awt.event.*;
import javax.swing.*;


public class ExemploJanela extends JFrame {
    public ExemploJanela() {
        final JFrame j = new JFrame("Exemplo de Janela");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel msg = new JLabel("Olá, mundo!");
        j.getContentPane().add(msg);
        j.setLocationRelativeTo(null);  // centraliza
        j.setIconImage(new ImageIcon("java.png").getImage());

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(new JMenu("Menu"));

        j.setJMenuBar(menuBar);

        j.pack();
        j.setVisible(true);
    }

    public static void main(String[] args) {
        ExemploJanela exemploJanela = new ExemploJanela();
    }
}