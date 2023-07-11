package p6_Fila_Refatorado;

public class Fila {

    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    // medoto enfileirar
    public void enqueue (Object obj) {
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    // medoto desenfileirar
    public Object dequeue() {
        if(!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila; // pega o ultimo elemento da fila
            No noAuxiliar = refNoEntradaFila;
            while(true) { // percorre toda a fila até chegar no primeiro da fila
                if(primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    // metodo first - ira trazer o primeiro item da fila
    public Object first() {
        if(!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila; // pega o ultimo elemento da fila
            while(true) { // percorre toda a fila até chegar no primeiro da fila
                if(primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;
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
