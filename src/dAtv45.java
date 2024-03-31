import java.util.Arrays;
import java.util.Scanner;

public class dAtv45 {
    public static void main(String[] args) {
    // Desenvolver um programa para verificar a nota do aluno em uma prova com 10 questões,
    // o programa deve perguntar ao aluno a resposta de cada questão e ao final comparar com o gabarito da prova
    // e assim calcular o total de acertos e a nota (atribuir 1 ponto por resposta certa). Após cada aluno utilizar o sistema deve ser feita uma pergunta se outro aluno vai utilizar o sistema. Após todos os alunos terem respondido informar:
    //Maior e Menor Acerto;
    //Total de Alunos que utilizaram o sistema;
    //A Média das Notas da Turma

        String[] resposta = new String[10];
        String reutilizarSys;
        Scanner ler = new Scanner(System.in);
        int acertos = 0, alunos = 0, media, total = 0;
        int alto = Integer.MIN_VALUE;
        int baixa = Integer.MAX_VALUE;

        String[] gabarito = {"A", "B", "C", "D", "E", "E", "D", "C", "B", "A"};
        do {
            alunos++;
            for (int i = 0; i < resposta.length; i++) {
                resposta[i] = ler.nextLine().toUpperCase();
                if (Arrays.asList(gabarito).contains(resposta[i])) {
                    acertos++;
                    total++;
                }
            }
                if (acertos > alto){
                    alto = acertos;
                }
                if (acertos < baixa){
                    baixa = acertos;
                }

            System.out.println("Sua nota foi: "+acertos);

            acertos = 0;

            System.out.println("Vai utilizar o sistema novamente? S/N");
            reutilizarSys = ler.nextLine().toUpperCase();

        } while(reutilizarSys.equals("S"));

        media = total / alunos;

        System.out.println("Maior nota: "+alto);
        System.out.println("Menor nota: "+baixa);
        System.out.println("Numeros de Alunos: "+alunos);
        System.out.println("Media da Turma: "+media);

    }
}
