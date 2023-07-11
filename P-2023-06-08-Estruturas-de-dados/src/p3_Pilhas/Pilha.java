// LIFO - LAST IN, FIRST OUT

package p3_Pilhas;

public class Pilha {
    
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo) {
        System.out.println("\nMETODO PUSH");
        System.out.println("- refNoEntradaPilha: " + refNoEntradaPilha);
        No refAuxiliar = refNoEntradaPilha;
        System.out.println("- refAuxiliar: " + refAuxiliar);
        System.out.println("- novoNo: " + novoNo);
        refNoEntradaPilha = novoNo;
        System.out.println("- refNoEntradaPilha: " + refNoEntradaPilha);
        System.out.println("- refAuxiliar: " + refAuxiliar);
        refNoEntradaPilha.setRefNo(refAuxiliar);
        System.out.println("- refNoEntradaPilha.RefNo: " + refNoEntradaPilha.getRefNo());

    }

    public No pop() {
        if(!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {
        return refNoEntradaPilha == null ? true : false;
    }


}
