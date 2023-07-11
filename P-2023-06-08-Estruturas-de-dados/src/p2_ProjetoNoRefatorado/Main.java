package p2_ProjetoNoRefatorado;

public class Main {
    
    public static void main(String[] args) {
        
        No<String> no1 = new No<String>("Conteudo no1");

        No<String> no2 = new No<String>("Conteudo no2");
        no1.setProximo_no(no2);

        No<String> no3 = new No<String>("Conteudo no3");
        no2.setProximo_no(no3);

        No<String> no4 = new No<String>("Conteudo no4");
        no3.setProximo_no(no4);

        System.out.println(no1);
        System.out.println(no1.getProximo_no());
        System.out.println(no1.getProximo_no().getProximo_no());
        System.out.println(no1.getProximo_no().getProximo_no().getProximo_no());
        System.out.println(no1.getProximo_no().getProximo_no().getProximo_no().getProximo_no());
    }

}
