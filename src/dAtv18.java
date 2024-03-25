import java.util.Scanner;

public class dAtv18 {
    public static void main(String[] args) {
        int numero, soma, result = 0, menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE;
        Scanner ler = new Scanner(System.in);

        System.out.print("Quantidade de números para comparação: ");
        numero = ler.nextInt();

        for (int contador = 0; contador < numero; contador++) {
            soma = ler.nextInt();
            result = result + soma;

            if (soma > maior) {
                maior = soma;
            }
            if (soma < menor) {
                menor = soma;
            }
        }
        System.out.println("Soma dos valores: " + result);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
