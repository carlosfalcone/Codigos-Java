package produtos;
import interfaces.telefone;

public class Iphone implements telefone {

    public static void main(String[] args) {
        Iphone meu_iphone = new Iphone();
        meu_iphone.ligar();
        meu_iphone.desligar();
        meu_iphone.acessarCaixaPostal();
    }

    public void ligar() {
        System.out.println("Ligando via iphone");
    }

    public void desligar() {
        System.out.println("Desligando via iphone");
    }

    public void acessarCaixaPostal() {
        System.out.println("Acessando caixa postal via iphone");
    }
    
}
