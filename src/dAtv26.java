import java.util.Scanner;
public class dAtv26 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int candidato, Cleitin = 0, Robertao = 0, Junin = 0;
        String simounao = "s";
        while(simounao.equals("s")){

            System.out.println("Canditos:");
            System.out.println("(1) Cleitin");
            System.out.println("(2) Robertão do Pneu");
            System.out.println("(3) Junin da Caneta");
            System.out.println("Para Para o Programa Digite: (p)");
            System.out.println("======================");
            System.out.print("Escolha um Candidato:");
            candidato = ler.nextInt();
            ler.nextLine();
            if (candidato == 1){
                Cleitin++;
            }
            if (candidato == 2){
                Robertao++;
            }
            if (candidato == 3){
                Junin++;
            }

            System.out.print("Continuar o programa? s/p :");
            simounao = ler.nextLine();
        }
        System.out.println("(1) Cleitin = "+Cleitin+ " Votos");
        System.out.println("(2) Robertão do Pneu = "+Robertao+ " Votos");
        System.out.println("(3) Junin da Caneta = "+Junin+ " Votos");
    }
}
