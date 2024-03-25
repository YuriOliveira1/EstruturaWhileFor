import java.util.Scanner;
public class dAtv24 {
    public static void main(String[] args) {
        int provas, nota, media, soma = 0;

        Scanner ler = new Scanner(System.in);

        System.out.print("São quantas provas para somar?: ");
        provas = ler.nextInt();

        for (int c = 0; c < provas; c++){
            System.out.print("Nota: ");
            nota = ler.nextInt();
            soma = nota + soma;
        }
        media = soma / provas;
        System.out.println("A soma das notas é " +soma);
        System.out.println("A media das notas é "+ media);
    }
}
