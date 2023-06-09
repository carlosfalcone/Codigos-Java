package p7_Fila_Refatorado_2;

public class No<T> {

    private T object; // conteudo do nó
    private No<T> refNo;

    // construtor padrao
    public No() { 
    }

    // construtor
    public No(T object) { 
        this.refNo = null;
        this.object = object;
    }
    
    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No<T> getRefNo() {
        return refNo;
    }

    public void setRefNo(No<T> refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No [object = " + object + "]";
    }

}
