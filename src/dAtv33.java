import java.util.Scanner;
public class dAtv33 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int c = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        System.out.println("OBS: PARA PARAR A CONTAGEM DIGITE 1500");

        System.out.print("Temperatura 1: ");
        double temp = ler.nextDouble();
        double soma = temp;

        while (temp != 1500) {
            c++;
            System.out.print("Temperatura " + (c + 1) + ": ");
            temp = ler.nextDouble();

            if (temp != 1500) {
                soma += temp;
                if (temp > maior) {
                    maior = temp;
                }
                if (temp < menor) {
                    menor = temp;
                }
            }
        }
        double media = soma / c;
        System.out.println("Media: " + media);
        System.out.println("Menor Temp: " + menor);
        System.out.println("Maior Temp: " + maior);
    }
}