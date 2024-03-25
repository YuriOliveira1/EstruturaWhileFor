
public class dAtv29 {
    public static void main(String[] args) {
        System.out.println("Lojas Quase Dois - Tabela de preços");
        for(int c = 1; c <= 50; c++){
            double preco = 1.99;
            double tabela;
            tabela = preco * c;
            System.out.println(c+ " - R$ "+tabela);
        }
    }
}
