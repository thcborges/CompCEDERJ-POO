package datatypes;          // Stack pertence a datatypes
import javax.swing.*;       // Importa todas as classes

/*
 * a partir desse ponto, posso usar o nome de
 * qualquer classe que pertença ao pacote
 * javax.swing.
 * */

public class Stack {        // Stack é exportada
    private int[] data;
    private int top_index;
    public Stack(int size) {
        data = new int[size];
        top_index = -1;
    }

    public boolean isEmpty() {
        return (top_index < 0);
    }

    public void push(int n) {
        data[++top_index] = n;
    }

    public int pop() {
        return data[top_index--];
    }

    public int top() {
        return data[top_index];
    }

}
