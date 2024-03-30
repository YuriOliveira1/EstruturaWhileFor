import java.util.Scanner;

public class dAtv42 {
    public static void main(String[] args) {
        // Faça um programa que leia uma quantidade indeterminada de números positivos
        // e conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100].
        // A entrada de dados deverá terminar quando for lido um número negativo.

        Scanner ler = new Scanner(System.in);
        int numero;
        int intevalo1 = 0;
        int intevalo2 = 0;
        int intevalo3 = 0;
        int intevalo4 = 0;
        do {
            System.out.print("Digite um numero: ");
            numero = ler.nextInt();

            if (numero >= 0 && numero <= 25){
                intevalo1++;
            }
            if (numero > 25 && numero <= 50){
                intevalo2++;
            }
            if (numero > 50 && numero <= 75){
                intevalo3++;
            }
            if (numero > 75 && numero <= 100){
                intevalo4++;
            }
        } while (numero > 0);

        System.out.println("[0-25]: "+intevalo1);
        System.out.println("[26-50]: "+intevalo2);
        System.out.println("[51-75]: "+intevalo3);
        System.out.println("[76-100]: "+intevalo4);
    }
}
