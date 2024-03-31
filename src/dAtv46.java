import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dAtv46 {
    public static void main(String[] args) {

        // Em uma competição de salto em distância cada atleta tem direito a cinco saltos.
        // No final da série de saltos de cada atleta, o melhor e o pior resultados são eliminados.
        // O seu resultado fica sendo a média dos três valores restantes.
        // Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos
        // e depois informe a média dos saltos conforme a descrição acima informada (retirar o melhor e o pior salto e depois calcular a média).
        // Faça uso de uma lista para armazenar os saltos. Os saltos são informados na ordem da execução, portanto não são ordenados.
        // O programa deve ser encerrado quando não for informado o nome do atleta. A saída do programa deve ser conforme o exemplo abaixo:

        Scanner ler = new Scanner(System.in);

        String nome;
        String[] sequenciaSaltos = {"Primeiro Salto: ", "Segundo Salto: ", "Terceiro Salto: ", "Quarto Salto: ", "Quinto Salto: "};
        ArrayList<Float> listSaltos  = new ArrayList<Float>();
        Float[] mSaltos = new Float[5];
        Float maior = Float.MIN_VALUE;
        Float menor = Float.MAX_VALUE;
        Float soma = 0.0f, media;

        System.out.print("Atleta: ");
        nome = ler.nextLine();

        for (int i = 0; i < sequenciaSaltos.length; i++){
            System.out.print(sequenciaSaltos[i]);
            mSaltos[i] = ler.nextFloat();
            soma += mSaltos[i];
            listSaltos.add(mSaltos[i]);
            if (mSaltos[i] > maior) {
                maior = mSaltos[i];
            }
            if (mSaltos[i] < menor){
                menor = mSaltos[i];
            }
        }

        media = (soma - (maior + menor)) / 3;
        System.out.println("");
        System.out.println("Melhor Salto: "+maior+" m");
        System.out.println("Pìor Salto: "+menor+" m");
        System.out.println("Média dos demais saltos:"+media+" m");
        System.out.println("");
        System.out.println("Resultado Final: ");
        System.out.println(nome+":"+media+" m");
    }

}
