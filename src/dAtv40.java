import java.util.Scanner;

public class dAtv40 {
    public static void main(String[] args) {
        // Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:
        // Código da cidade;
        // Número de veículos de passeio (em 1999);
        // Número de acidentes de trânsito com vítimas (em 1999). Deseja-se saber:
        // Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
        // Qual a média de veículos nas cinco cidades juntas;
        // Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.

        int somaVeiculos = 0;
        int mediaAcidentePequena = 0;
        int cidadePequena = 0;
        int[]codigoCidade = new int[6];
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int menorCodigoCidade = 0;
        int maiorCodigoCidade = 0;

        Scanner ler = new Scanner(System.in);

        for (int c = 1; c <= codigoCidade.length-1; c++) {
            System.out.print("Codigo da Cidade: ");
            codigoCidade[c] = ler.nextInt();

            System.out.print("Número de veículos de passeio: ");
            int numeroVeiculos = ler.nextInt();
            somaVeiculos += numeroVeiculos;

            if (numeroVeiculos < 2000){
                cidadePequena++;
                mediaAcidentePequena += numeroVeiculos;
            }

            System.out.print("Número de Acidente de Transito: ");
            int numeroAcidente;
            numeroAcidente = ler.nextInt();
            if (numeroAcidente > maior) {
                maior = numeroAcidente;
                maiorCodigoCidade = codigoCidade[c];
            }
            if (numeroAcidente < menor) {
                menor = numeroAcidente;
                menorCodigoCidade = codigoCidade[c];
            }
        }
        int media = media = somaVeiculos / 5;
        int mediaPequena = mediaAcidentePequena / cidadePequena;
        System.out.println("Codigo da cidade com menor indice "+ maiorCodigoCidade+ " foram "+maior+ " acidentes");
        System.out.println("Codigo da cidade com maior indice "+ menorCodigoCidade+ " foram "+menor+ " acidentes");
        System.out.println("Media de Veiculos: "+media);
        System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: "+mediaPequena);
    }

}
