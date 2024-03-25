import java.util.Scanner;
public class Atv3 {
    public static void main(String[] args) {
        String nome, sexo, ec; // Ec = Estado Civil
        int idade;
        float salario;
        Scanner ler = new Scanner(System.in);

        // Ler Nome;
        System.out.print("Digite um nome: ");
        nome = ler.nextLine();
        int caracteres = nome.length();
        while(caracteres < 3) {
            System.out.print("Digite um nome: ");
            nome = ler.nextLine();
            caracteres = nome.length();
        }


        // Ler idade;
        System.out.print("Digite um Idade: ");
        idade = ler.nextInt();
        ler.nextLine(); // Limpar Buffer
        while(idade > 150){
            System.out.print("Digite um Idade: ");
            idade = ler.nextInt();
            ler.nextLine(); // Limpar Buffer
        }

        // Ler Salario;
        System.out.print("Digite seu Salario: ");
        salario = ler.nextFloat();
        ler.nextLine(); // Limpar Buffer
        while (salario < 0){
            System.out.print("Digite seu Salario: ");
            salario = ler.nextFloat();
            ler.nextLine(); // Limpar Buffer
        }

        // Ler Sexo (F ou M);
        System.out.print("Digite seu Sexo(f ou m): ");
        sexo = ler.nextLine();
        while(!sexo.equals("f") && !sexo.equals("m")){
            System.out.print("Digite seu Sexo(f ou m): ");
            sexo = ler.nextLine();
        }

        // Ler Estado Civil (Solteiro, Casado, Viuvo, Divorciado)
        System.out.print("Digite seu Estado Civil (s, c, v, d): ");
        ec = ler.nextLine();
        while(!ec.equals("s") && !ec.equals("c") && !ec.equals("v") && !ec.equals("d")){
            System.out.print("Digite seu Estado Civil (s, c, v, d): ");
            ec = ler.nextLine();
        }
        }
    }






