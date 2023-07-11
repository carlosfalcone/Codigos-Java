package p7_Fila_Refatorado_2;

public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    // medoto enfileirar
    public void enqueue (T object) {
        No<T> novoNo = new No<>(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    // medoto desenfileirar
    public T dequeue() {
        if(!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila; // pega o ultimo elemento da fila
            No<T> noAuxiliar = refNoEntradaFila;
            while(true) { // percorre toda a fila até chegar no primeiro da fila
                if(primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    // metodo first - ira trazer o primeiro item da fila
    public T first() {
        if(!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila; // pega o ultimo elemento da fila
            while(true) { // percorre toda a fila até chegar no primeiro da fila
                if(primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No<T> noAuxiliar = refNoEntradaFila;
        if(refNoEntradaFila != null) {
            while(true){
                stringRetorno += "[No {object = " + noAuxiliar.getObject() + "}} --> ";
                if(noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        }else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
    

    

}
