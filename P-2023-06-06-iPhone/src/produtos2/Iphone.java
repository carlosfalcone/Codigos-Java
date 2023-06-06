package produtos2;
import interfaces2.Telefone;
import interfaces2.AparelhoMusical;
import interfaces2.NavegadorInternet;

public class Iphone implements Telefone, AparelhoMusical, NavegadorInternet {

    public static void main(String[] args) {
        Iphone meu_iphone = new Iphone();
        meu_iphone.ligar();
        meu_iphone.atender();
        meu_iphone.iniciarCorreioVoz();
        meu_iphone.tocarMusica();
        meu_iphone.pausarMusica();
        meu_iphone.selecionarMusica();
        meu_iphone.exibirPagina();
        meu_iphone.adicionarNovaAba();
        meu_iphone.atualizarPagina();
    }
 
    public void ligar() {
        System.out.println("Ligando do iphone");
    }

    public void atender() {
        System.out.println("Atendendo do iphone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iphone");
    }

    public void tocarMusica() {
        System.out.println("Tocando musica no iphone");
    }

    public void pausarMusica() {
        System.out.println("Pausando musica no iphone");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando musica no iphone");
    }

    public void exibirPagina() {
        System.out.println("Exibindo pagina da internet no iphone");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba da internet no iphone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina da internet no iphone");
    }

}
