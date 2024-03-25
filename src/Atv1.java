import  java.util.Scanner;
public class Atv1 {
    public static void main(String[] args) {
        int nota;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma nota entre 0 e 10: ");
        nota = ler.nextInt();
        while (nota > 10) {
                System.out.println("Digite um número valido na linha abaixo: ");
                nota = ler.nextInt();
        }
    }
}
