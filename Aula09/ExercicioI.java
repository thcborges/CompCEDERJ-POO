import java.util.*;


public class ExercicioI {
    private static final String[] colors = {"vermelho", "preto", "branco", "amarelo"};

    public ExercicioI() {
        List<String> list = new ArrayList<String>();
        Arrays.sort(colors);
        for (String color: colors) {
            list.add(color);
        }
        list.add("branco");
        list.add("preto");
        this.imprimeLista(list);
    }

    private void imprimeLista(Collection<String> c) {
        Iterator<String> it = c.iterator();
        System.out.println("Conteúdo da lista:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        new ExercicioI();
    }
}