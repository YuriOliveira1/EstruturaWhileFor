import java.util.Scanner;
public class dAtv36 {
    public static void main(String[] args) {
        int number, comeca, termina;
        Scanner ler = new Scanner(System.in);

        // Ler o numero
        System.out.print("Tabuada de: ");
        number = ler.nextInt();

        // Ler onde começa e termina
        System.out.print("Começa em: ");
        comeca = ler.nextInt();
        System.out.print("Termina em: ");
        termina = ler.nextInt();

        if (comeca < termina) {
            while (termina >= comeca) {
                System.out.println("O numero que começa é maior que termina, mas fiz o programa como solicitado");
                int resultado = number * termina;
                System.out.println(number + " X " + termina + " = " + resultado);
                termina--;
            }
        } else {
            while (comeca <= termina) {
                int resultado = number * comeca;
                System.out.println(number + " X " + comeca + " = " + resultado);
                comeca++;
            }
        }
    }
}
