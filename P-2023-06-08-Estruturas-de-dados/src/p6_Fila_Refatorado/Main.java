package p6_Fila_Refatorado;

// Encapsulamento da classe Nó

public class Main {

    public static void main(String[] args) {
        Fila minhaFila = new Fila();
        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue(3);
        // minhaFila.enqueue(new No("quarto"));

        System.out.println("Saida 1: " + minhaFila);

        System.out.println("Saida 2: " + minhaFila.dequeue());

        System.out.println("Saida 3: " + minhaFila);

        minhaFila.enqueue("ultimo");

        System.out.println("Saida 4: " + minhaFila);

        System.out.println("Saida 5: " + minhaFila.first());

        System.out.println("Saida 6: " + minhaFila);
    }
    
}
