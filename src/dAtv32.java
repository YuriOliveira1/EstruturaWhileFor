import java.util.Scanner;
public class dAtv32 {
    public static void main(String[] args) {
        int numero, contador = 1, fatorial = 1;
        Scanner ler = new Scanner(System.in);

        // Ler o numero:
        System.out.print("Fatorial de : ");
        numero = ler.nextInt();
        int fat = numero;
        int vezes = numero + 1;
        System.out.print(numero+"!=");
        while(contador <= numero){
            fatorial = fatorial * contador;
            contador++;
            vezes--;

            System.out.print(vezes+".");
        }
        System.out.print(" = "+fatorial);
    }
}
