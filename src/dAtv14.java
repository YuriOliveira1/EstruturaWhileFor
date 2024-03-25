import java.util.Scanner;
public class dAtv14 {
    public static void main(String[] args) {
        int numero, par = 0, impar = 0;
        Scanner ler = new Scanner(System.in);

        // Ler os numeros e verificar se é impar ou par
        for (int contador = 1; contador <= 10; contador++){
            System.out.print("Digite um numero "+contador+ ": ");
            numero = ler.nextInt();
            if (numero % 2 == 0){
                par++;
            }else {
                impar++;
            }
        }

        // Saída
        System.out.println("=========================");
        System.out.println("Numeros Pares: " +par);
        System.out.println("Numeros Impares: " +impar);

    }
}
