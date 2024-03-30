import java.util.Scanner;

public class dAtv41 {
    public static void main(String[] args) {
        // Faça um programa que receba o valor de uma dívida e mostre uma tabela com
        // os seguintes dados: valor da dívida, valor dos juros, quantidade de parcelas e valor da parcela

        Scanner ler = new Scanner(System.in);

        float valorDivida;

        // valor dos juros = ValorDivida / Juros que está na tabela
        // Quantidade de parcelas = Tabela, ela +=3
        // Valor da parcela = (Valor do Juros + Valor da Divida) / Quantidade Parcelas

        int[] juros = {0, 10, 15, 20, 25};
        int[] quantParcelas = {1, 3, 6, 9, 12};
        float valorParcela = 0;

        System.out.print("Valor da dívida: ");
        valorDivida = ler.nextFloat();

        for (int c = 0; c <= 4; c++) {
            System.out.println("Valor da Divida: "+valorDivida);
            float valorJuros = valorDivida * (juros[c] / 100.0f);
            valorParcela = (valorDivida + valorJuros) / quantParcelas[c];
            System.out.println("Valor do Juros: "+ valorJuros);
            System.out.println("Quantidade de parcelas: "+quantParcelas[c]);
            System.out.println("Valor da Parcela : "+ valorParcela);
            System.out.println("===========================");
        }

    }
}
