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

        // Tabuada
        while (comeca <= termina){
            int resultado = number * comeca;
            System.out.println(number+ " X " + comeca + " = " + resultado);
            comeca++;
        }
    }
}
