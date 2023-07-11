package p1_ProjetoNo;

public class No {
    
    private String conteudo;
    private No proximo_no;

    public No (String conteudo) {
        this.proximo_no = null;
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximo_no() {
        return proximo_no;
    }

    public void setProximo_no(No proximo_no) {
        this.proximo_no = proximo_no;
    }

    @Override
    public String toString() {
        return "No [conteudo = '" + conteudo + "']";
    }

 
    
}
