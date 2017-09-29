import java.io.File;


public class ExemploFile {
    public static void main(String[] args) {
        File f = new File("teste.txt");
        if (f.exists()) {
            System.out.println("Dados do arquivo: " + f.getAbsolutePath());
            System.out.println("Tamanho: " + f.length() + " bytes");
            System.out.println("Pode ser escrito? " + (f.canWrite() ? "sim" : "não"));
        }
    }
}
