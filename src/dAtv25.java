import java.util.Scanner;
public class dAtv25 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, pessoas= 0, soma = 0, media ;

        String simounao= "s";
        while (simounao.equals("s")){
            System.out.print("Qual é a sua idade?: ");
            idade = ler.nextInt();
            soma = idade + soma;
            pessoas++;
            ler.nextLine();
            System.out.print("Quer continuar lendo idades? s/n :");
            simounao = ler.nextLine();

        }

        media = soma / pessoas;
        if (media > 0 && media <= 25) {
            System.out.println("A Turma é jovem");
        } else if (media < 60){
            System.out.println("A turma é Adulta");
        } else {
            System.out.println("A turma é idosa");
        }
    }
}
