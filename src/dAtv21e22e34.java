import  java.util.Scanner;
public class dAtv21e22e34 {
    public static void main(String[] args) {
        int numero, tot = 0;
        Scanner ler = new Scanner(System.in);
        numero = ler.nextInt();

        for (int c = 1; c <= numero; c++) {
            if (numero % c == 0) {
                tot ++;
                System.out.println("Ele é divisivel por: "+ c);
            }
        }
        System.out.println("O numero "+numero+" foi divido "+tot+" vezes");

        if(tot == 2){
            System.out.println("O numero é Primo");
        } else {
            System.out.println("O Numero não é Primo");
        }

    }
}
