import java.io.FileReader;
import java.io.IOException;


class DivByZero extends Exception {

    @Override
    public String toString() {
        return "Division by zero.";
    }
}


public class Calc {
    public int div(int a, int b) throws DivByZero {
        if (b == 0) {
            throw new DivByZero();
        } else {
            return  a/b;
        }
    }

    public void readFile(String name) throws IOException {
        FileReader file = null;
        try {
            file = new FileReader(name);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (file != null) {
                file.close();
            }
        }
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        try {
            int div = calc.div(2, 0);
        } catch (DivByZero e) {
            System.out.println(e);
        }

        try {
            calc.readFile("texto.txt");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}