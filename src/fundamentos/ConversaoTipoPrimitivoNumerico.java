package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {
        double a = 1; // Conversão Implícita
        System.out.println(a);

        float b = (float) 1.12345; // Conversão explícita (CAST)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c; // Conversão explícita (CAST)
        System.out.println(d);

    }
}
