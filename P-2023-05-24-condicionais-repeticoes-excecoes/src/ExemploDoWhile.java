import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            // executando repetidas vezes até alguem atender
            System.out.println("Telefone tocando...");

        }while(tocando()); // retorna ao loop enquanto while é igual a true

        // Interrompe o loop quando while for igual a false e imprime a frase abaixo
        System.out.println("Alô!");
        
    }

    private static boolean tocando() {
        int valor_aleatorio = new Random().nextInt(3);
        System.out.println("Valor aleatorio: " + valor_aleatorio);

        boolean atendeu = valor_aleatorio == 1; // condição ternária - retorno true ou false
        System.out.println("Atendeu? " + atendeu);;
        // negando o ato de continuar tocando
        return ! atendeu; // retorna o oposto do retorno da variavel atendeu
    }
}
