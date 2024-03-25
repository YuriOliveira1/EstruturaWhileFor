import java.util.Scanner;
public class Atv7 {
    public static void main(String[] args) {
     int number, maior = 0;
     Scanner ler = new Scanner(System.in);
     for (int contador = 0; contador < 5; contador++){
         System.out.print("Digite um numero: ");
         number = ler.nextInt();
         if (number > maior){
             maior = number;
         }
     }
        System.out.println(maior);
    }
}
