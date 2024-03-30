import java.util.Scanner;

public class dAtv44 {
    public static void main(String[] args) {

        int votos, tonhao = 0, chico = 0, rogerio = 0, carlos = 0, nulo = 0, branco = 0, totalvotos = 0;
        float porcentagemnulo = 0, porcentagembranco = 0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Número dos Candidatos: ");
        System.out.println("1 - Tonhão da Capivara");
        System.out.println("2 - Chico do Portão");
        System.out.println("3 - Rogerio, o Marceneiro");
        System.out.println("4 - Carlos, o Sargento");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto Branco");
        System.out.println("============================");

        do {
            System.out.print("Qual é o seu voto? ");
            votos = ler.nextInt();

            switch (votos){
                case 1:
                    tonhao++;
                break;

                case 2:
                    chico++;
                    break;

                case 3:
                    rogerio++;
                    break;

                case 4:
                    carlos++;
                    break;

                case 5:
                    nulo++;
                    break;

                case 6:
                    branco++;
                    break;
            }
            totalvotos = tonhao + chico + rogerio + carlos + nulo + branco;

        } while (votos > 0);

        porcentagemnulo = (float) (nulo * 100) / totalvotos;
        porcentagembranco = (float) (branco * 100) / totalvotos;

        System.out.println("1 - Tonhão da Capivara: "+tonhao+" Votos");
        System.out.println("2 - Chico do Portão: "+chico+" Votos");
        System.out.println("3 - Rogerio, o Marceneiro: "+rogerio+" Votos");
        System.out.println("4 - Carlos, o Sargento: "+carlos+" Votos");
        System.out.println("5 - Voto Nulo: "+nulo+" Votos");
        System.out.println("6 - Voto Branco: "+branco+" Votos");
        System.out.println("A percentagem de votos nulos sobre o total de votos: "+porcentagemnulo);
        System.out.println("A percentagem de votos em branco sobre o total de votos: "+porcentagembranco);


    }
}
