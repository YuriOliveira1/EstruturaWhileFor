public class Atv4 {
    public static void main(String[] args) {
        int paisA = 80000, paisB = 200000,TempoA = 0;
        float populacaoA, populacaoB;
        populacaoA = (float)  ((80000 * 3) / 100);
        populacaoB = (float) ((200000 * 1.5) / 100);

        while (paisA <= paisB){
            TempoA++;
            paisA = (int) (paisA + populacaoA);
            paisB = (int) (paisB + populacaoB);
            populacaoA = (float) ((paisA * 3) / 100);
            populacaoB = (float) ((paisB * 1.5) / 100);
        }
            System.out.println("Numeros de Anos: " +TempoA+ " Anos");
    }
}
