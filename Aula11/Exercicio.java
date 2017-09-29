import java.io.*;


public class Exercicio {
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new FileReader("teste.txt"));
            out = new BufferedWriter(new FileWriter("teste2.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                out.write(str);
            }
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
