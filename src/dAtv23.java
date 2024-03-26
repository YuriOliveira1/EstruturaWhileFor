import  java.util.Scanner;
public class dAtv23 {
    public static void main(String[] args) {

        // O programa deverá mostrar também o número de divisões que ele executou
        // para encontrar os números primos. Serão avaliados o funcionamento, o estilo e o número de testes (divisões) executados.

        int numero, tot = 0;
        Scanner ler = new Scanner(System.in);
        System.out.print("Até que numero Primo: ");
        numero = ler.nextInt();

        for (int c = 1; c <= numero; c++) {
            for (int c2 = 1; c2 <= c; c2++) {
                if (c2 % c == 0) {
                    tot++;
                    if (tot == 2){
                        System.out.println(c2);
                    }
                }

            }

        }
        System.out.println("O numero "+numero+" foi divido "+tot+" vezes");

    }
}