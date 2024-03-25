import  java.util.Scanner;
public class dAtv13 {
    public static void main(String[] args) {
        int base, expoente, contador = 0, resultado = 0;
        Scanner ler = new Scanner(System.in);

        // Ler a Base e Expoente
        System.out.print("Base: ");
        base = ler.nextInt();
        ler.nextLine(); // Limpar buffer
        System.out.print("Expoente: ");
        expoente = ler.nextInt();

        // Potencia
        while (contador <= expoente){
            contador++;
            resultado = base * base;
            resultado = base * resultado;
            
        }
        System.out.println(resultado);
    }
}
