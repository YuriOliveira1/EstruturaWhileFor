import java.util.Scanner;
public class dAtv10 {
    public static void main(String[] args) {
        int number1, number2;
        Scanner ler = new Scanner(System.in);

        // Ler os dois numeros:
        number1 = ler.nextInt();
        number2 = ler.nextInt();

        // Loop
        while (number1 > number2) {
            number2++;
            System.out.println(number2);
        }
        while (number2 > number1) {
            number1++;
            System.out.println(number1);
        }

    }
}
