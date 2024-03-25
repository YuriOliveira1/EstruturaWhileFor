import java.util.Scanner;
public class dAtv37 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int c = 0;
        double baixo = Double.MIN_VALUE;
        double alto = Double.MAX_VALUE;
        double magro = Double.MIN_VALUE;
        double gordo = Double.MAX_VALUE;
        System.out.println("OBS: PARA PARAR O PROGRAMA DIGITE  EM Código");

        System.out.print("Código: ");
        double codigo = ler.nextDouble();


        while (codigo > 0) {

            // Codigo
            System.out.print("Código: ");
            codigo = ler.nextDouble();

            // Peso
            System.out.print("Peso: ");
            double peso = ler.nextDouble();

            // Altura
            System.out.print("Altura: ");
            double altura = ler.nextDouble();

        }
    }
}