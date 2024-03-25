import java.util.Scanner;
public class Atv8 {
    public static void main(String[] args) {
    int number, soma = 0, media;
    Scanner ler = new Scanner(System.in);

    // Ler os 5 Numeros
    for (int contador = 0; contador < 5; contador++ ){
        number = ler.nextInt();
        soma = soma + number;
    }

        media = soma / 5;
        System.out.println("Soma: "+ soma);
        System.out.println("Media: "+ media);
    }
}
