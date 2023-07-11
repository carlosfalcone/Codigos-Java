package p1_ProjetoNo;

public class Main {
    
    public static void main(String[] args) {
        No no1 = new No("Conteudo no1");
        No no2 = new No("Conteudo no2");
        no1.setProximo_no(no2);
        No no3 = new No("Conteudo no3");
        no2.setProximo_no(no3);
        No no4 = new No("Conteudo no4");
        no3.setProximo_no(no4);

        System.out.println(no1);
        System.out.println(no1.getProximo_no());
        System.out.println(no1.getProximo_no().getProximo_no());
        System.out.println(no1.getProximo_no().getProximo_no().getProximo_no());
        System.out.println(no1.getProximo_no().getProximo_no().getProximo_no().getProximo_no());
    }

}
