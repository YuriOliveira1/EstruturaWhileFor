import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Double.*;

public class dAtv30 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Preço do pão: R$");
        double preco = preco = ler.nextDouble();

        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
        for(int c = 1; c <= 50; c++){
            double tabela;
            tabela = preco * c;
            DecimalFormat formato = new DecimalFormat("#.##");
            tabela = parseDouble(formato.format(tabela));
            System.out.println(c+ " - R$ "+tabela);
        }
    }
}
