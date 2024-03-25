import java.util.Scanner;
public class Atv2 {
    public static void main(String[] args) {
        String usuario, senha;
        Scanner ler = new Scanner(System.in);
        System.out.print("Usuario: ");
        usuario = ler.nextLine();
        System.out.print("Senha: ");
        senha = ler.nextLine();
            while (senha.equals(usuario)) {
                System.out.println("ERROR: Senha é igual ao Usuario...");
                System.out.print("Usuario: ");
                usuario = ler.nextLine();
                System.out.print("Senha: ");
                senha = ler.nextLine();
        }


    }
}
