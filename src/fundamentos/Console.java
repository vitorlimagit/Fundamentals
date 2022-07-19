package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        System.out.print("Bom");
        System.out.print(" Dia\n\n");

        System.out.println("Bom");
        System.out.println("Dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d %n",
                1 , 2 , 3 , 4 , 5, 6);

        System.out.printf("Salário: %.1f %n", 1234.5678);
        System.out.printf("Nome: %s %n", "João");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("\n\nNome = " + nome + " " + sobrenome);

        System.out.printf("%s %s tem %d anos.%n",
                nome, sobrenome, idade);

        entrada.close();


    }

}
