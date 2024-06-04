public class ContadorImpar {
    public static void main(String[] args) {
        int cont = 0;
        for (int i = 1; i<100; i++) {
            if (i % 2 == 1) {
            System.out.print(" " + i + "  ||");
            cont++;
            }
        }
        System.out.println("");
        System.out.println("Existem " + cont + " números pares de 1 até 100.");
    }
}
