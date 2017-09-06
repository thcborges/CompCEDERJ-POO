interface A {

}

interface B extends A {
    int y = 10;
}

class C {
    static int y = 20;
}

class D extends C implements B {
    public static void main(String[] args) {
        System.out.println("A soma das constantes é:");
        System.out.println(B.y + C.y);
    }
}