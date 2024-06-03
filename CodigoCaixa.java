import java.util.Scanner;
public class CodigoCaixa {
    public static void main(String[] args) {
        int consulta = 1;
        Scanner sc = new Scanner(System.in);
        while (consulta != 2) {
            System.out.println("  * CONSULTA DE PRODUTOS *  ");
            System.out.println("");
            System.out.println(" 1 - Consultar produto");
            System.out.println(" 2 - Sair do programa");
            consulta = sc.nextInt();
            switch (consulta) {
                case 5478:
                System.out.print("O produto selecionado foi: ");
                System.out.println("Arroz (5Kg)");
                System.out.println("Preço Unitário: R$15,90");
                break;
                case 0123:
                System.out.print("O produto selecionado foi: ");
                System.out.println("Chocolate (150g)");
                System.out.println("Preço Unitário: R$3,99");
                break;
                default:
                System.out.println("Digite um valor registrado.");
            }
        }
    sc.close();
    }
}
