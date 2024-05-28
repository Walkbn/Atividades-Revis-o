
import java.util.Scanner;
public class SelecionarPlanoCelular {
    public static void main(String[]args) {
        System.out.println("========================================");
        System.out.println(" ");
        System.out.println("Selecione o plano de celular que deseja: ");
        System.out.println(" ");
        System.out.println("========================================");
        System.out.println(" ");
        System.out.println(" 1 - Plano Básico (5GB Youtube.)");
        System.out.println(" 2 - Plano Plus (Adição de Whatsapp e Instagram grátis.)");
        System.out.println(" 3 - Plano Premium (Adição de 100 minutos de ligação.)");
        System.out.println(" ");
        System.out.println("========================================");
        System.out.println(" ");
        System.out.print("Digite a opção: ");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        sc.close();
        switch (op) {
            case 1:
            System.out.println("Párabens! o plano selecionado foi: \n  1 - Plano Básico (5GB Youtube.)");
            break;
            case 2:
            System.out.println("Párabens! o plano selecionado foi: \n  2 - Plano Plus (Adição de Whatsapp e Instagram grátis.)");
            break;
            case 3:
            System.out.println("Párabens! o plano selecionado foi: \n  3 - Plano Premium (Adição de 100 minutos de ligação.)");
            break;
        }
    }
}
