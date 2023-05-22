public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("Ligando a TV");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Desligando a TV");
    }

    public void aumentarVolume() {
        if(ligada==true){
            volume++;
            System.out.println("Volume: " + volume);
        }

    }

    public void diminuirVolume() {
        if(ligada==true){
            volume--;
            System.out.println("Volume: " + volume);
        }

    }

    public void aumentarCanal() {
        if(ligada==true) {
            canal++;
            System.out.println("Canal: " + canal);
        }
        
    }

    public void diminuirCanal() {
        if(ligada==true) {
            canal--;
            System.out.println("Canal: " + canal);
        }
        
    }

    public void selecionarCanal(int selecao_canal) {
        if(ligada==true) {
            canal = selecao_canal;
            System.out.println("Canal: " + canal);
        }
        
    }

}