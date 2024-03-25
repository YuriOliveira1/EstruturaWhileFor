import java.util.Scanner;
public class dAtv31 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int c = 1;
        System.out.print("Produto 1: ");
        double preco = preco = ler.nextDouble();
        double soma = preco;
        while (preco > 0){
            c++;
            System.out.print("Produto "+ c+": ");
            preco = ler.nextDouble();
            soma += preco;
        }
        System.out.println("Total: "+soma);
        System.out.print("Dinheiro: R$");
        double dinheiro = dinheiro = ler.nextDouble();
        double troco = dinheiro - soma;
        System.out.println("Troco: R$ "+troco);
    }
}
