package p5_Filas;

public class Main {

    public static void main(String[] args) {
        Fila minhaFila = new Fila();
        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No(4));
        minhaFila.enqueue(new No(true));

        System.out.println("Saida 1: " + minhaFila);

        System.out.println("Saida 2: " + minhaFila.dequeue());

        System.out.println("Saida 3: " + minhaFila);

        minhaFila.enqueue(new No("ultimo"));

        System.out.println("Saida 4: " + minhaFila);

        System.out.println("Saida 5: " + minhaFila.first());

        System.out.println("Saida 6: " + minhaFila);
    }
    
}
