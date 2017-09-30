import java.awt.event.*;
import javax.swing.*;


public class JanelaSimples extends JFrame {
    public JanelaSimples() {
        final JButton botaoLimpa = new JButton("Limpa");  // botão
        final JTextField campoTexto = new JTextField(10);  // texto
        final JFrame janela = new JFrame("Janela Simples");  // janela
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300, 100);

        JPanel painel = new JPanel();  // adiciona componentes
        painel.add(botaoLimpa);
        painel.add(campoTexto);
        janela.getContentPane().add(painel);

        // Quando o usuário clicar no botão, limpa o campo de texto
        botaoLimpa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoTexto.setText("");
            }
        });

        janela.setVisible(true);  // Exibe a janela
    }

    public static void main(String[] args) {
        JanelaSimples janelaSimples = new JanelaSimples();
    }
}