import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dAtv47 {
    public static void main(String[] args) {

       // Em uma competição de ginástica, cada atleta recebe votos de sete jurados.
        // A melhor e a pior nota são eliminadas. A sua nota fica sendo a média dos votos restantes.
        // Você deve fazer um programa que receba o nome do ginasta e as notas dos sete jurados alcançadas pelo atleta em sua apresentação e
        // depois informe a sua média, conforme a descrição acima informada (retirar o melhor e o pior salto e depois calcular a média com as notas restantes).
        // As notas não são informados ordenadas. Um exemplo de saída do programa deve ser conforme o exemplo abaixo:

        Scanner ler = new Scanner(System.in);

        String nome;

        Float notas;
        Float maior = Float.MIN_VALUE;
        Float menor = Float.MAX_VALUE;
        Float soma = 0.0f, media;

        System.out.print("Atleta: ");
        nome = ler.nextLine();

        for (int i = 0; i < 7; i++){
            System.out.print("Notas: ");
            notas = ler.nextFloat();
            soma += notas;
            if (notas > maior) {
                maior = notas;
            }
            if (notas < menor){
                menor = notas;
            }
        }

        media = (soma - (maior + menor)) / 5;
        System.out.println("");
        System.out.println("Melhor nota: "+maior);
        System.out.println("Pìor nota: "+menor);
        System.out.println("Média: "+media);
        System.out.println("");
        System.out.println("Resultado Final: ");
        System.out.println(nome+":"+media+" m");
    }

}
