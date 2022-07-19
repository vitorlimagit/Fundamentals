package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(4));

        String s = "Boa Tarde";
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.endsWith("tarde"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.printf("O Senhor %s %s tem %d anos e ganha R$ %.2f.",
                nome, sobrenome, idade, salario);

        String frase = String.format("\nO Senhor %s %s tem %d anos e ganha R$ %.2f.",
                nome, sobrenome, idade, salario);

        System.out.println(frase);



    }
}
