import java.util.*;

class MinhaLista<T> {
    private List<T> itens = new ArrayList<T>();
    void add (T item) {
        itens.add(item);
    }
    T primeiro() {
        return itens.get(0);
    }
}

public class Ex2 {
    public static void main(String[] args) {
        MinhaLista<String> ml = new MinhaLista<String>();
        ml.add("primeiro");
        ml.add("segundo");
        System.out.println(ml.primeiro());
    }
}