import java.util.Scanner;
public class dAtv12 {
    public static void main(String[] args) {
     int number;
     Scanner ler = new Scanner(System.in);

     // Ler o numero
        System.out.print("Tabuada de: ");
        number = ler.nextInt();

        // Tabuada
        for(int contador = 0; contador <= 10; contador++){
            int resultado = number * contador;
            System.out.println(number+ " X " + contador + " = " + resultado);
        }
    }
}
