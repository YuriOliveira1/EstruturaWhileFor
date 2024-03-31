import java.util.Scanner;

public class dAtv49 {
    public static void main(String[] args) {
        // Faça um programa que mostre os n termos da Série a seguir:
        // S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
        // Imprima no final a soma da série.

        Scanner ler = new Scanner(System.in);
        int n, soma = 1, m = 1;

        System.out.print("Qual é o valor de N: ");
        n = ler.nextInt();

        for (int i = 1, j = 1; i <= n; i++, j += 2) {
            double termo = (double)i / j;
            System.out.println(i+ ": " + i + "/" + j + " = " + termo);
        }
    }
}
