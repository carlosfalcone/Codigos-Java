public class Teste2 {
    
    public static void main(String[] args) {
        int variavel = 9; // nao tem como deixar a variavel sem a definiçao de valor
        System.out.println(variavel);

        final double PI = 3.14; // palavra reservada 'final' define uma variavel com um unico valor constante
        System.out.println(PI);
        PI = 4.2; // Esta linha dará um erro, pois o PI é uma constante, definida pela palavra reservada 'final'
    }

}
