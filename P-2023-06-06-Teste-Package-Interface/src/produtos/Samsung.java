package produtos;
import interfaces.telefone;

public class Samsung implements telefone {
    
    public static void main(String[] args) {
        Samsung meu_samsung = new Samsung();
        meu_samsung.ligar();
        meu_samsung.desligar();
        meu_samsung.acessarCaixaPostal();
    }

    public void ligar() {
        System.out.println("Ligando via samsung");
    }

    public void desligar() {
        System.out.println("Desligando via samsung");
    }

    public void acessarCaixaPostal() {
        System.out.println("Acessando caixa postal via samsung");
    }

}
