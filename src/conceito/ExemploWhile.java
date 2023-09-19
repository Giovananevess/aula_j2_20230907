package conceito;

public class ExemploWhile {
    public static void execute() {
        int contWhile = 4;

        while(contWhile < 4) {
            System.out.println("While: " + contWhile);
            contWhile++;
        }

        int contDoWhile = 4;
        do {
            System.out.println("DoWhile: " + contDoWhile);
            contDoWhile++;
        } while (contDoWhile < 4);
    }
}
