import  java.util.Scanner;
public class dAtv28 {
    public static void main(String[] args) {
        int cds;
        float preco, media, soma = 0;
        Scanner ler = new Scanner(System.in);

        // Usuario Informa a quantidade
        System.out.print("Quantidade de CD's: ");
        cds = ler.nextInt();

        for (int c = 1; c <= cds; c++) {
            System.out.print("Digite o preço do " + c + " CD: R$");
            preco = ler.nextFloat();
            soma += preco;
        }
        media = soma / cds;
        System.out.println("O valor investido foi de R$"+soma);
        System.out.println("A media gasta em cada CD é de R$"+media);
    }
}
