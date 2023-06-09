package p6_Fila_Refatorado;

public class No {

    private Object object; // conteudo do nó
    private No refNo;

    // construtor padrao
    public No() { 
    }

    // construtor
    public No(Object object) { 
        this.refNo = null;
        this.object = object;
    }
    
    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No [object = " + object + "]";
    }

}
