package p0_ConceitosIniciais;

public class TesteAtribuicao {
    
    public static void main(String[] args) {
        
        System.out.println("Atribuiçao de tipos primitivos em java:");
        // int A = 1;
        // int B = A;
        Integer A = 1;
        Integer B = A;
        // Funciona usando int ou Integer.
        System.out.println("A = " + A + " e B = " + B);
        System.out.println();
        System.out.println("Atualização de A:");
        A = 2;
        System.out.println("A = " + A + " e B = " + B);
        System.out.println("B nao é atualizado depois da atualizaçao de A");


        System.out.println("");
        System.out.println("Atribuição de objetos:");
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;
        System.out.println("objA = " + objA + " e objB = " + objB);
        System.out.println("Atualização de A:");
        objA.setNum(2);
        System.out.println("objA = " + objA + " e objB = " + objB);
        System.out.println("B TAMBÉM é atualizado depois da atualizaçao de A");

        // O tipo primitivo copia o valor de A para B.
        // O objeto copia a referencia do valor de A para B. Por isso A e B apontam pra mesma referencia na memória e por isso os dois atualizam quando o valor é de A é atualizado.

    }

}
