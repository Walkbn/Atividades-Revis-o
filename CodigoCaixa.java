import java.util.Scanner;
public class CodigoCaixa {
    public static void main(String[] args) {
        int consulta = 1;
        Scanner sc = new Scanner(System.in);
        while (consulta != 2) {
            System.out.println("========================");
            System.out.println("  * CONSULTA DE PRODUTOS *  ");
            System.out.println("========================");
            System.out.println(" Código - Consultar produto");
            System.out.println("");
            System.out.println(" 2 - Sair do programa");
            System.out.println("========================");
            System.out.println();
            System.out.print("-> ");
            consulta = sc.nextInt();
            switch (consulta) {
                case 5478:
                System.out.print("O produto selecionado foi: ");
                System.out.println("Arroz (5Kg)");
                System.out.println("Preço Unitário: R$15,90");
                break;
                case 3285:
                System.out.print("O produto selecionado foi: ");
                System.out.println("Feijão (1Kg)");
                System.out.println("Preço Unitário: R$7,50");
                break;
                case 8097:
                System.out.print("O produto selecionado foi: ");
                System.out.println("Macarrão (500g)");
                System.out.println("Preço Unitário: R$4,20");
                break;
                case 7314:
                System.out.print("O produto selecionado foi: ");
                System.out.println("Leite (1L)");
                System.out.println("Preço Unitário: R$3,80");
                break;
                case 9801:
                System.out.print("O produto selecionado foi: ");
                System.out.println("Pão Frances (Kg)");
                System.out.println("Preço Unitário: R$12,00");
                break;
                case 8510:
                System.out.print("O produto selecionado foi: ");
                System.out.println("Açucar (1Kg)");
                System.out.println("Preço Unitário: R$2,90");
                break;
                case 8503:
                System.out.print("O produto selecionado foi: ");
                System.out.println("Café (500g)");
                System.out.println("Preço Unitário: R$8,50");
                break;
                case 2985:
                System.out.print("O produto selecionado foi: ");
                System.out.println("Óleo de Soja (900ml)");
                System.out.println("Preço Unitário: R$5,60");
                break;
                case 6141:
                System.out.print("O produto selecionado foi: ");
                System.out.println("Margarina (500g)");
                System.out.println("Preço Unitário: R$4,50");
                break;
                case 1030:
                System.out.print("O produto selecionado foi: ");
                System.out.println("Sabão em pó (1Kg)");
                System.out.println("Preço Unitário: R$10,00");
                break;
                case 9001:
                System.out.print("O produto selecionado foi: ");
                System.out.println("Deterngente (500ml)");
                System.out.println("Preço Unitário: R$2,20");
                break;
                case 5002:
                System.out.print("O produto selecionado foi: ");
                System.out.println("Papel Higiênico (4un)");
                System.out.println("Preço Unitário: R$6,00");
                break;
                case 7436:
                System.out.print("O produto selecionado foi: ");
                System.out.println("Shampoo (350ml)");
                System.out.println("Preço Unitário: R$9,90");
                break;
                case 0274:
                System.out.print("O produto selecionado foi: ");
                System.out.println("Condicionador (350ml)");
                System.out.println("Preço Unitário: R$9,90");
                break;
                case 7456:
                System.out.print("O produto selecionado foi: ");
                System.out.println("Pasta de Dente (90g)");
                System.out.println("Preço Unitário: R$3,50");
                break;
                case 2:
                System.out.println("Saindo do programa.");
                break;
                default:
                System.out.println("Digite um valor registrado.");
                break;
            }
        }
        sc.close();
    }
}