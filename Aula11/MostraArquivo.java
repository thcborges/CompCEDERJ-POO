import java.io.*;


public class MostraArquivo {
    public static void main(String[] args) {
        InputStream fi = null;
        int i = -1;
        try {
            fi = new FileInputStream("teste.txt");
        }catch (FileNotFoundException e) {
            System.out.println(e);
        }
        do {
            try {
                i = fi.read();
            } catch (IOException e) {
                System.out.println("Aqruivo não pode ser lido!!");
            }
            if (i != -1) {
                System.out.print((char) i);
            }
        } while (i != -1);
    }
}