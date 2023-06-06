import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.00;

        while(mesada > 0) {

            Double valor_doce = valorAleatorio();
            System.out.println("Valor do doce: " + valor_doce);
            mesada = mesada - valor_doce;

        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joaozinho gastou toda a sua mesada em doces.");

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }

}
