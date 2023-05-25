import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o segundo número: ");
        int parametro2 = terminal.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro precisa maior que o primeiro!");
        }

    }
    
    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {

        if (parametro1 > parametro2)
        throw new ParametrosInvalidosException();

        int contagem = parametro2 - parametro1;

        for (int x=1; x <= contagem; x++){
            System.out.println("O número é: " + x);
        }

    }
}
