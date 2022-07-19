package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro Salário: ");
        String primeiroSalario = entrada.nextLine();

        System.out.println("Digite o primeiro Salário: ");
        String segundoSalario = entrada.nextLine();

        System.out.println("Digite o primeiro Salário: ");
        String terceiroSalario = entrada.nextLine();

        double sal1 = Double.parseDouble(primeiroSalario);
        double sal2 = Double.parseDouble(segundoSalario);
        double sal3 = Double.parseDouble(terceiroSalario);

        double media = sal1 + sal2 + sal3 / 3;

        System.out.println("A Média dos seus 3 últimos Salários é: " + media);

        entrada.close();

    }
}
