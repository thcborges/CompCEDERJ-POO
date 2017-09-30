import java.awt.*;
import javax.swing.*;


public class Celular {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Celular");  // janela

        JLabel visor = new JLabel("5122299");  // visor
//        visor.setAlignment(JLabel.RIGHT);

        JPanel num = new JPanel(new GridLayout(4, 3));  // teclado
        String[] n = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
        for (int i = 0; i < n.length; i++) {
            num.add(new Button(n[i]));
        }

        JPanel botoes = new JPanel();  // send & end
        ((FlowLayout)botoes.getLayout()).setVgap(0);
        botoes.add(new Button("send"));
        botoes.add(new Button("end"));

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.add(visor, BorderLayout.NORTH);  // monta tudo
        janela.add(num, BorderLayout.CENTER);
        janela.add(botoes, BorderLayout.SOUTH);
        janela.pack();  // mostra
        janela.setVisible(true);
    }
}