import java.util.Scanner;
public class Atv5 {
    public static void main(String[] args) {
        int paisa, paisb , Tempoa = 0;
        float populacaoa, populacaob, taxaA, taxaB;
        Scanner ler = new Scanner(System.in);

        // Ler População A e Taxa de Crescimento;
        System.out.print("Digite a População: ");
        paisa = ler.nextInt();
        ler.nextLine(); // Limpar buffer
        System.out.print("Digite a Taxa de Crescimento: ");
        taxaA = ler.nextFloat();

        System.out.println("========================");

        // Ler População B e Taxa de Crescimento;
        System.out.print("Digite a População: ");
        paisb = ler.nextInt();
        ler.nextLine(); // Limpar buffer
        System.out.print("Digite a Taxa de Crescimento: ");
        taxaB = ler.nextFloat();

        populacaoa = (float)  ((paisa * taxaA) / 100);
        populacaob = (float) ((paisb * taxaB) / 100);


        while (paisa <= paisb){
            Tempoa++;
            paisa = (int) (paisa + populacaoa);
            paisb = (int) (paisb + populacaob);
            populacaoa = (float) ((paisa * taxaA) / 100);
            populacaob = (float) ((paisb * taxaB) / 100);
        }

        System.out.println("========================");
        System.out.println("Numeros de Anos: " +Tempoa+ " Anos");
    }
}


