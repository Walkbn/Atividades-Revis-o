import java.util.Scanner;
public class VerificarObrigVoto {
    public static void main(String[] args) {
        System.out.print("Digite a idade do eleitor : ");
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        scanner.close();
        if (idade<=15) {
            System.out.println("O cidadão não precisa votar.");
        } else if (idade==16||idade==17||idade>=70) {
            System.out.println("O cidadão terá o voto facultativo.");
        } else if (idade>=18||idade<=69) {
            System.out.println("O cidadão é obrigado a votar.");
        }
    }
}
