class Tipos {
  public static void main(String[] args) {

    /**********************************
     **********************************
     *       Tipos básicos de Java
     **********************************/
    // Inteiros
    byte b;  // 1 bytes, valores de -128 a 127
    short s;  // 2 bytes, valores de -32,768 a 32,767
    int in;  // 4 bytes, valores de -2,147,483,648 a 2,147,483,647
    long l;  // 8 bytes, valores de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807

    // Ponto flutuante
    float fl;  // 4  bytes, valores de -3.40282347E+38 a 3.40282347E+38
    double d, e;  // 8 bytes, valores de -1.7976931348623E+308 a 1.7976931348623E+308

    // Caractere
    char a;  // 2 bytes, tabela unicode
    char c;  // 2 bytes, tabela unicode

    // Lógico
    boolean boo;  // 1 byte, valres True ou False

    // Operadores de atribuição:

    // Atribuição na declaração
    int i = 2, j = 3;
    c = 'A';
    boo = true;

    // Atribuiução após a declaração
    fl = 7.5F;  // o 'F' de 7.5F significa que esse número é um ponto flutuante **
    d = 3.9;


    /**************************************
     **************************************
     *          Operadores
     **************************************/
     // Aritméticos
     int x = 5;
     int y = x + 1;   // Soma                           => y == 6
     int z = x * y;   // Multiplicação                  => z == 30
     float w;
     w = 30 / 4f;     // Divizão com ponto flutuante    => w == 7.5f
     z = 30 / 7;      // Divisãao inteira               => z == 4
     z = 10 % x;      // Módulo, resto da divisão       => z == 0
     z += 3;          // Adição com atribuição          => z era igual a 0, passa a ser igual a 3
     x *= 2;          // Multiplicação com atribuição   => x era igual a 5, passa a ser igual a 10

                      /* Outros operadores com atribuição:
                          * -= subtração
                          * /= divisão
                          * %= módulo
                          * += adição
                          * *= multiplicação
                      */

     // Incremento
     y = x++;         // Faz a operação, depois incrementa o x    => y == 5 e x == 6
     y = x--;         // Faz a operação, depois decrementa o x    => y == 6 e x == 5
     y = ++x;         // Incrementa o x, depois faz a operação    => y == 6 e x == 6
     y = --x;          // Decrementa o x, depois faz a operação    => y == 5 e x == 6

     // Relacionais
     boolean q, g;
     x =5; y =7;
     q = (x == y);    // Igualdade          => q == false
     g = (x < y);     // Menor que          => g == true
     q = (x != y);    // Diferente          => q == true
     g = (y >= x);    // maior ou igual a   => g == true

     // Lógicos
     x = 5; y = 5;
     boolean k = true;
     k = x == y;
     q = !k;                        // Negação, como k é true,  b == false
     k = ((x == 5) && (y == 5));    // && => 'E' lógico         k == true
     k = ((x == 0) || (y == x));    // || => 'OU' lógico        k == true

     // Bit a Bit
     int r;
     i = 2;     // i == 00000000 00000000 00000000 00000010
     j = 10;    // j == 00000000 00000000 00000000 00001010

     r = j & i;     // 'e' => j & i == 00000000 00000000 00000000 00000010 == 2
     r = j | i;     // 'ou' => j | i == 00000000 00000000 00000000 00001010 == 10
     r = j ^ i;     // 'ou exclusivo => j ^ i == 00000000 00000000 00000000 00001000 == 8
     r = j << i;    // deslocar bits para esquerda => j << i == 00000000 00000000 00000000 0101000 == 40
     r = j >> i;    // deslocar bits para direita => j >> i == 00000000 00000000 00000000 00000010 == 2
     r = j >>> i;   // deslocar bits para direita, pondo zero nos bits mais significativos => j >>> 1 == 00000000 00000000 00000000 00000010  == 2
     r = ~i;        // nega os bits => ~i == 11111111 11111111 11111111 11111101 == -3

     // Condicional ==> Operador ternário
     int m; i = 15; j = 0;
     m = i > j ? 45 : 5;   // verifica se i é maior que j. Como i maior que j recebe m == 45, se j fosse maior m == 5

     /***************************************
      * Precedêcia de Operadores
      *   []  .
      *   !   ~   ++  --  (conversão de tipos)
      *   *   /   %
      *   +   -
      *   <<  >>  >>>
      *   ==  !=
      *   &
      *   ^
      *   |
      *   &&
      *   ||
      *   ? :
      *   =   +=  -=  *=  /=  %=
      ***************************************/


      /**************************************
       * Conversão entre tipos numéricos
       *
       * Algumas informações podem ser perdidas, porém algumas conversões
       * podem ser feitassem a necessidade de cast:
       *      byte -> short -> int -> long -> float -> double
       **************************************/
      e = 9.9997;      // e é um double
      y = (int) x;     // y == 9  => a parte fracionário é perdida
      e = 9.5f;        // como e já é um double, não há problema em converter um float para double
      l = y;           // l é um long, então não há problema em converter um inteiro em um long


       /***************************************
        **************************************
        *  Classes pré definidas
        **************************************/

      // Textos ou 'String'
      String texto = "Exemplo";             // Cadeia de caracteres

      // Verores
      int[] lista = {1, 2, 3, 4, 5};
      String[] nomes = {"João", "Maria"};
      System.out.println(nomes[0]);       // Imprime João


      /****************************************
       ****************************************
       * Comandos de controle de fluxo
       ****************************************/

      // Comando Condicional: if-else
      int h = 5; z = 3;
      if ((h > 0) && (z > 0))
        m = (h + z) / 2;
      else {
        System.out.println("número negativo");
        m = 0;
      }

      // Comando condicional: switch
      h = 5;
      switch (h) {
        case 5:
          System.out.println(5);
          break;
        case 0:
          System.out.println(0);
          break;
        default:
          System.out.println("erro");
      }

      // Comando de repetição: while
      i = 0;
      while (i < 10) {
        System.out.println(i);
        i++;
      }

      // Comando de repetição: do-while
      i = 0;
      do {
        System.out.println(i);
        i++;
      } while (i < 10);

      // Comando de repetição fo
      for (i = 0; i < 10; i++) {
        System.out.println(i);
      }

      // Comando de desvio: break
      i = 0;
      while (true) {
        if (i == 10) break;
        i++;
        System.out.println(i);
      }

      // Comando de saída de método:
      x = 9; y = 5;
      i = media(x, y);
      System.out.println(i);

  }

  // Comando de saída de método: return
  static  int media (int a, int b) {
    return (a + b) / 2;
  }
}
