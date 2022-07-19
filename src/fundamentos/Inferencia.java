package fundamentos;

public class Inferencia {

    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a); // O Java vai inferir o tipo de variavel pelo valor atribuido

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro Texto";
        System.out.println(c);

        double d; // variável foi declarada
        d = 123.65; // variável foi inicializada
        System.out.println(d); // usada !


    }
}
