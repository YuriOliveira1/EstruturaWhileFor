import java.util.Scanner;

public class dAtv50 {
    public static void main(String[] args) {
        // Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que calcule o valor de H com N termos

        Scanner ler = new Scanner(System.in);
        int n;
        float total = 0, calc;
        System.out.print("Valor de N: ");
        n = ler.nextInt();

        for (int i = 1; i <= n; i++){
            float soma = 1.0f / i;
            total += soma;
            System.out.print("1/"+i+" + ");
        }
        calc = 1 + total;
        System.out.println(calc);
    }
}
