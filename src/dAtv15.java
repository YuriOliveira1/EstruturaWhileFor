public class dAtv15 {
    public static void main(String[] args) {
        int a = 1, b = 0, soma;

        for(int contador = 1; contador <= 10; contador++){
            System.out.println(a);
           soma = a;
           a = a + b;
           b = soma;
        }
    }
}
