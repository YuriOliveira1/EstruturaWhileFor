public class dAtv16 {
    public static void main(String[] args) {
        int a = 1, b = 0, soma = 0;

        while(soma <= 500){
            System.out.println(a);
            soma = a;
            a = a + b;
            b = soma;
        }
    }
}
