import java.util.Scanner;
public class MedidorTemperatura {
    public static void main(String[] args) {
        System.out.print("Digite a temperatura atual: ");
        Scanner sc = new Scanner(System.in);
        Double temp; temp = sc.nextDouble();
        sc.close();
        if (temp<0) {System.out.println("Cuidado! Poderá nevar na sua região.");}
        else if (temp<=20) {System.out.println("Tempo frio! Possibilidade de ventos fortes.");}
        else if (temp<=30) {System.out.println("Tempo agradável durante todo o dia.");}
        else {System.out.println("Calor excessivo! Risco de insolação.");}
    }
}
