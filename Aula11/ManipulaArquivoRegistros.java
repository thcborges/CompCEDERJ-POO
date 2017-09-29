import java.io.*;


public class ManipulaArquivoRegistros implements Serializable {
    int id;
    float nota;
    static int quant = 0;

    public ManipulaArquivoRegistros(float n) {
        quant++;
        id = quant;
        nota = n;
    }

    public static void InicializaRegistros() {
        try {
            FileOutputStream f = new FileOutputStream("dados.dat");
            ObjectOutputStream fobj = new ObjectOutputStream(f);
            for (int i = 1; i <= 10; i++) {
                ManipulaArquivoRegistros reg = new ManipulaArquivoRegistros(i);
                fobj.writeObject(reg);
            }
            fobj.close();
            f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void RecuperaRegistros() {
        try {
            FileInputStream f = new FileInputStream("dados.dat");
            ObjectInputStream fobj = new ObjectInputStream(f);
            for (int i = 1; i <= 10; i++) {
                ManipulaArquivoRegistros reg = (ManipulaArquivoRegistros)fobj.readObject();
                System.out.print("Id: " + reg.id);
                System.out.println(" Nota: " + reg.nota);
            }
            fobj.close();
            f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        InicializaRegistros();
        RecuperaRegistros();
    }

}
