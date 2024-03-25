import java.util.Scanner;

public class dAtv20 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String simounao = "s";
        while (simounao.equals("s")) {
            int numero, contador = 1, fatorial = 1;

            // Ler o número:
            System.out.print("Fatorial de: ");
            numero = ler.nextInt();
            int vezes = numero;
            System.out.print(numero + "! = ");

            while (contador <= numero) {
                fatorial *= contador;
                System.out.print(contador);
                if (contador < numero) {
                    System.out.print(" x ");
                }
                contador++;
            }
            System.out.println(" = " + fatorial);

            System.out.println("Deseja digitar outro número? (s/n)");
            simounao = ler.next();
        }
    }
}