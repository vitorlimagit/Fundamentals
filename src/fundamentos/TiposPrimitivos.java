package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {


        // Informaćoes do funcionario

        // Tipo numérico inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        // Tipos númericos reais
        float salario = 11_4445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false; // true

        // Tipo caractere
        char status = 'A'; // ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Número de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real

        System.out.println(pontosAcumulados / vendasAcumuladas);

        // Salario por Id
        System.out.println(id + ": ganhar ->" + salario);

        // Está de Férias
        System.out.println("Férias? " + estaDeFerias);

        // Status
        System.out.println("Status: " + status);

    }
}
