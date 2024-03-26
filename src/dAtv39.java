import java.util.Scanner;
public class dAtv39 {
    public static void main(String[] args) {

        // Faça um programa que leia dez conjuntos de dois valores, o primeiro representando o número do
        // e o segundo representando a sua altura em centímetros. Encontre o aluno mais alto e o mais baixo.
        // Mostre o número do aluno mais alto e o número do aluno mais baixo, junto com suas alturas.

        int codigo, codigo1 = 0, codigo2 = 0;
        double altura, maior = 0, codigomaior = 0;
        double baixo = Double.MAX_VALUE;
        double alto = Double.MIN_VALUE;

        Scanner ler = new Scanner(System.in);

        for (int c = 1; c <= 3; c++){

            System.out.print("Codigo do Aluno: ");
            codigo = ler.nextInt();
            System.out.print("Altura do Aluno (Cm): ");
            altura = ler.nextDouble();

            // Alto ou baixo
            if (altura > alto) {
                alto = altura;
                codigo1 = codigo;
            }
            if (altura < baixo) {
                baixo = altura;
                codigo2 = codigo;
            }
        }
        System.out.println("Aluno mais alto: "+codigo1+ " medindo "+alto);
        System.out.println("Aluno mais mais baixo: "+codigo2+ " medindo "+baixo);
    }
}
