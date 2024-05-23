import java.util.Scanner;
public class CompararNumeros {
    public static void main(String[] args) {
        System.out.println("ESTE É UM PROGRAMA PARA VALORES DE COMPARAÇÃO DE MENOR E MAIOR.");
        System.out.print("Digite o primeiro valor:");
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        System.out.print("Digite o segundo valor:");
        int valor2 = scanner.nextInt();
        scanner.close();
        
        if (valor>valor2) {
            System.out.println("O valor digitado no n°" + valor + " é maior que o valor n°" + valor2);
        } else if (valor<valor2) {
            System.out.println("O valor digitado no n°" +valor + " é menor que n°" + valor2);
        } else if (valor==valor2) {
            System.out.println("O valor digitado no n°" + valor + " é igual a °" + valor2);
        } 
    }
}
