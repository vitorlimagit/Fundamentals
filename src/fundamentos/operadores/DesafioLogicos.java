package fundamentos.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {
        // Trabalho na terća (V ou F)
        // Trabalho na quinta (V ou F)

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        // Operador Unário
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou Tv 50\"?" + comprouTv50);
        System.out.println("Comprou Tv 32\"?" + comprouTV32);
        System.out.println("Comprou Tv 32\"Sorvete?" + comprouSorvete);
        System.out.println("Mais saudável?" + maisSaudavel);

    }
}
