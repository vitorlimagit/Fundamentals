package fundamentos.operadores;

public class Ternario {

    public static void main(String[] args) {


        double media = 5.6;

        String resultadoFinal = media>= 7.0 ?
                "Aprovado" : "reprovado";

        System.out.println("O Aluno está " + resultadoFinal);

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "Sim" : "Não.";

        System.out.printf("Tem desconto? %s", resultado);





    }
}
