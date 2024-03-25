import java.util.Scanner;
public class dAtv27 {
    public static void main(String[] args) {
        int turmas, alunos, soma = 0, media, menos = 0;

        Scanner ler = new Scanner(System.in);
        System.out.print("Quantas turmas há na escola? ");
        turmas = ler.nextInt();

        for (int c = 1; c <= turmas; c++){
            System.out.print("Turma "+c+ ":");
            alunos = ler.nextInt();
            if (alunos <= 40){
                soma += alunos;
            } else {
                System.out.println("As salas tem que ter menos de 40 alunos");
                turmas++;
                menos++;
            }
        }
        media = soma / (turmas - menos);
        System.out.println(media);
    }
}
