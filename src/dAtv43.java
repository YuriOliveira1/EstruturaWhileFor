
import java.util.Locale;
import java.util.Scanner;

public class dAtv43 {
    public static void main(String[] args) {
        // Faça um programa que leia o código dos itens pedidos e as quantidades desejadas.
        // Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido.
        // Considere que o cliente deve informar quando o pedido deve ser encerrado.

        int codigo, itens, quantidade;
        float preco = 0, totalpreco = 0;
        String cancel;
        Scanner ler = new Scanner(System.in);
        System.out.println("Tabela dos Codigos:");
        System.out.println("Cachorro Quente 100 "+"\n"+ "Bauru Simples   101"+"\n"+ "Bauru com ovo   102 "+"\n"+ "Hambúrguer      103 "+"\n"+"heeseburguer    104 "+"\n"+"Refrigerante    105 ");
        System.out.println("=========================");

        do {
            System.out.print("Codigo do Produto:");
            codigo = ler.nextInt();
            ler.nextLine();
            System.out.print("Quantidade desejada: ");
            quantidade = ler.nextInt();
            ler.nextLine();

            if (codigo == 100){
                preco = (float) (quantidade * 1.20);
            }
            if (codigo == 101){
                preco = (float) (quantidade * 1.30);
            }
            if (codigo == 102){
                preco = (float) (quantidade * 1.50);
            }
            if (codigo == 103){
                preco = (float) (quantidade * 1.20);
            }
            if (codigo == 104){
                preco = (float) (quantidade * 1.30);
            }
            if (codigo == 105){
                preco = (float) (quantidade * 1.00);
            }
            totalpreco += preco;
            System.out.print("Deseja continuar? S/N: ");
            cancel = ler.nextLine().toLowerCase(Locale.ROOT);

        } while (cancel.equals("s"));
        System.out.println("Preço Total: "+totalpreco);
    }
}
