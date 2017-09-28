interface Dicionario {
    void insere(Object chave, Object valor) throws DicionarioExc;

    Object consulta(Object chave);

    void remove(Object chave) throws DicionarioExc;
}


class DicionarioExc extends Exception {
    public DicionarioExc(String msg) {
        super(msg);
    }
}


class DicionarioImpl implements Dicionario {
    class Par {
        Object chave;
        Object valor;

        Par (Object chave, Object valor) {
            this.chave = chave;
            this.valor = valor;
        }

    };

    Par[] pares;
    int ultimo;
    DicionarioImpl(int tamanho) {
        pares = new Par[tamanho];
        ultimo = -1;
    }

    public void insere (Object chave, Object valor) throws DicionarioExc {
        if (ultimo == pares.length - 1) {
            throw new DicionarioExc("Não existe espaço para inserir " + chave);
        }
        ++ultimo;
        pares[ultimo] = new Par(chave, valor);
    }

    @Override
    public Object consulta(Object chave) {
        for (int i = 0; i <= ultimo; i++) {
            if (pares[i] != null && pares[i].chave.equals(chave)) {
                return pares[i].valor;
            }
        }
        return null;
    }

    @Override
    public void remove(Object chave) throws DicionarioExc {
        for (int i = 0; i <= ultimo; i++) {
            if (pares[i].chave.equals(chave)) {
                pares[i] = pares[ultimo--];
                return;
            }
        }
        throw new DicionarioExc("Não foi encontrada a chave " + chave);
    }
}


public class Exercicio {
    public static void main(String[] args) {
        Dicionario d = new DicionarioImpl(2);
        try {
            d.insere("José", "2512-1212");
            d.insere("João", "2512-1313");
            d.insere("Maria", "3512-2299");
        } catch (Exception e) {
            System.out.println(e);
        }
        String tel = (String)d.consulta("João");
        if (tel != null){
            System.out.println("Telefone de João é: " + tel);
        } else {
            System.out.println("Telefone não encontrado");
        }
        String tel2 = (String)d.consulta("Luis");
        if (tel2 != null) {
            System.out.println("Telefone de Luis é: " + tel2);
        } else {
            System.out.println("Telefone não encontrado");
        }
    }
}
