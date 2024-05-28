import java.util.Scanner;
import java.util.Random;
public class AdivinharNumero {
    public static void main(String[] args) {
        System.out.println("O valor foi escolhido aleatóriamente, tente adivinhar!");
        Scanner resposta = new Scanner(System.in);
        Random random = new Random();
        int randomico = random.nextInt(10); int rp = 0;
        while (rp!=randomico) {
            System.out.print("-> ");
            rp = resposta.nextInt();
            if (randomico==rp) {
                System.out.println("Você acertou!");
                resposta.close();
            }
        }
    }
}
