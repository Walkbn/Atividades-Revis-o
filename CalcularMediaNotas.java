import java.util.Scanner;
public class CalcularMediaNotas {
    public static void main(String[]args) {
        System.out.println("Digite as notas do aluno: ");
        double nota[] = new double[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<4; i++) {
            System.out.print(i+1 + "° Nota do aluno: ");
            nota[i] = sc.nextInt();
        }
        double media = 0;
        for (int i =0; i<4; i++) { media= media+nota[i]; }
        media = media/4;
        sc.close();
        System.out.println("A média do aluno é: " + media);
    }
}
