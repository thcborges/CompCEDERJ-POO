import java.awt.event.*;
import javax.swing.*;


public class ExemploBotoes extends JFrame {
    public ExemploBotoes() {
        /*  Cria um botão com texto */
        final JButton botao1 = new JButton("Botão Desabilitado");
        botao1.setEnabled(false);
        botao1.setToolTipText("Exemplo de um botão de texto");
        botao1.setMnemonic(KeyEvent.VK_D);  // ALT + D

        /* Cria um botão com texto e imagem */
        final JButton botao2 = new JButton(
                "Botão Habilitado",
                new ImageIcon("Java-icon.png")
        );
        botao2.setToolTipText("Botão de texto e imagem");
        botao2.setMnemonic(KeyEvent.VK_H);  // ALT + H
        botao2.setPressedIcon(new ImageIcon("java.png"));

        final JFrame janela = new JFrame("Janela Simples");  // janela
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(500, 350);

        JPanel painel = new JPanel();  // adiciona componentes
        painel.add(botao1);
        painel.add(botao2);
        janela.getContentPane().add(painel);

        janela.setVisible(true);  // Exibe a janela
    }

    public static void main(String[] args) {
        ExemploBotoes exemploBotoes = new ExemploBotoes();
    }
}