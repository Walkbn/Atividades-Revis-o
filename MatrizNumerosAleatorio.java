import java.util.Random;
public class MatrizNumerosAleatorio {
    public static void main(String[] args) {
        int[][] numeroaleatorio = new int [5][5];
        Random randomico = new Random(0);
        for (int i = 0; i<5; i++ ) {
            for (int j = 0; j<5; j++) {
            numeroaleatorio[i][j] = randomico.nextInt(100);
            System.out.print(" | " + numeroaleatorio[i][j] + " | ");
            }
            System.out.println(" ");
        }
    }
}
