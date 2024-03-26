import java.util.Scanner;
public class dAtv38 {
    public static void main(String[] args) {
        double salario, aumento = 0.015, acumuladorsalario = 0, acumuladoraumento = 0, ano;

        Scanner ler = new Scanner(System.in);

        System.out.print("Qual é o seu salario: R$");
        salario = ler.nextDouble();

        System.out.print("Qual é o ano atual: ");
        ano = ler.nextDouble();

        acumuladoraumento = salario * aumento;

        for (int c = 1997; c <= ano; c++) {
            aumento = aumento * 2;
            acumuladorsalario = salario * aumento;
        }
        salario += acumuladorsalario + acumuladoraumento;
        System.out.println("Salario corresponde a R$"+salario);
    }
}
