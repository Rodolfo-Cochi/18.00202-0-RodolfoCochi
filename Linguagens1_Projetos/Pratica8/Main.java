public class Main {
    public static void main(String[] args) {
        System.out.println("inicio do main");
        metodo1();
        System.out.println("fim do main");
    }

    // metodos
    static void metodo1() {
        System.out.println("inicio do metodo1");
        metodo2();
        System.out.println("fim do metodo2");
    }

    static void metodo2() {
        System.out.println("inicio do metodo2");
        int[] array = new int[10];
        for (int i = 0; i <= 15; i++) {
            try {
                array[i] = i;
            } catch (NullPointerException exception) {
                System.out.println("Posicao invalida: " + i);
            }
        }
        System.out.println("fim metodo2");
    }
}
