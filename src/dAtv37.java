import java.util.Scanner;

public class dAtv37 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int c = 0;
        double baixo = Double.MAX_VALUE;
        double alto = Double.MIN_VALUE;
        double magro = Double.MAX_VALUE;
        double gordo = Double.MIN_VALUE;
        double codigo1 = 0, codigo2 = 0, codigo3 = 0, codigo4 = 0;

        System.out.println("OBS: PARA PARAR O PROGRAMA DIGITE UM CÓDIGO NEGATIVO");

        System.out.print("Código: ");
        double codigo = ler.nextDouble();

        while (codigo > 0) {
            // Peso
            System.out.print("Peso: ");
            double peso = ler.nextDouble();

            // Altura
            System.out.print("Altura: ");
            double altura = ler.nextDouble();

            // Gordo ou Magro
            if (peso > gordo) {
                gordo = peso;
                codigo1 = codigo;
            }
            if (peso < magro) {
                magro = peso;
                codigo2 = codigo;
            }

            // Alto ou baixo
            if (altura > alto) {
                alto = altura;
                codigo3 = codigo;
            }
            if (altura < baixo) {
                baixo = altura;
                codigo4 = codigo;
            }

            System.out.print("Código: ");
            codigo = ler.nextDouble();
        }

        System.out.println("Código da pessoa mais gorda: " + codigo1);
        System.out.println("Código da pessoa mais magra: " + codigo2);
        System.out.println("Código da pessoa mais alta: " + codigo3);
        System.out.println("Código da pessoa mais baixa: " + codigo4);
    }
}