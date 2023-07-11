package p2_ProjetoNoRefatorado;

// Fonte: https://github.com/jrdutra/estruturaDeDadosJavaDio/blob/main/projetos/Aula4/listaencadeada/src/main/java/one/digitalinnovation/No.java
// Refatoração da classe no
// T - tipo generico. Aceita conteudo de qualquer tipo.

public class No<T> {
    
    private T conteudo;
    private No<T> proximo_no;

    public No (T conteudo) {
        this.proximo_no = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximo_no() {
        return proximo_no;
    }

    public void setProximo_no(No<T> proximo_no) {
        this.proximo_no = proximo_no;
    }

    @Override
    public String toString() {
        return "No [conteudo = '" + conteudo + "']";
    }

 
    
}
