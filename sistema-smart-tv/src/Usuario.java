public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        
        System.out.println("STATUS INICIAL ");
        System.out.println("Status ligado: " + smartTv.ligada);
        System.out.println("Status canal: " + smartTv.canal);
        System.out.println("Status volume: " + smartTv.volume);
        System.out.println(" ");

        smartTv.ligar();
        // smartTv.desligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        smartTv.selecionarCanal(43);
        smartTv.desligar();
        
        System.out.println(" ");
        System.out.println("STATUS FINAL");
        System.out.println("Status ligado: " + smartTv.ligada);
        System.out.println("Status canal: " + smartTv.canal);
        System.out.println("Status volume: " + smartTv.volume);
    }
}
