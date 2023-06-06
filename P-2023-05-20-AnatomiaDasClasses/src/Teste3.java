
public class Teste3 {
    
    public static void main(String[] args) {
        int numero1 = 5;
        numero1++; // mesma coisa que numero1 = numero1 + 1
        System.out.println("numero1: " + numero1); 


        int numero2 = 5;
        numero2--;
        System.out.println("numero2: " + numero2); // mesma coisa que numero1 = numero1 - 1


        boolean variavel1 = true;
        variavel1 = !variavel1; // operaçao de negaçao
        System.out.println("variavel1: " + variavel1);


        int a = 5, b = 6;
        String resultado1 = "";
        if (a==b)
            resultado1 = "verdadeiro";
        else
            resultado1 = "falso";
            System.out.println("resultado1: " + resultado1);
            // Ou podemos escrever da seguinte forma:
            String resultado2 = a==b ? "Verdadeiro" : "Falso";
            System.out.println("resultado2: " + resultado2);
            // Ou podemos escrever de mais uma outra forma:
            int resultado3 = a==b ? 1 : 0;
            System.out.println("resultado3: " + resultado3);


        numero1 = 1; // o tipo desta variavel já foi definido lá em cima
        numero2 = 2; // o tipo desta variavel já foi definido lá em cima
        if(numero1 == numero2) {
            System.out.println("Os números são iguais");} // as chaves é que definem o que será executado dentro da condicional if
        else {
            System.out.println("Os números são diferentes");} // as chaves é que definem o que será executado dentro da condicional else
    

        boolean condicao1 = true, condicao2 = false;
        if(condicao1 && condicao2) { // AND
            System.out.println("As duas condições sao verdadeiras");
        }
        if(condicao1 || condicao2) { //OR
            System.out.println("Uma das condições é verdadeira");
        }

        // Quando se tem apenas uma linha de comando em cada if, nao precisa das chaves
        boolean condicao3 = true, condicao4 = true;
        if(condicao3 && condicao4)  // AND
            System.out.println(" - As duas condições sao verdadeiras");
        
        if(condicao3 || condicao4)  //OR
            System.out.println(" - Uma das condições é verdadeira");
        


        System.out.println("FIM"); // para esta linha ser escrita de forma automatica, digite 'sout' e aperte a tecla de espaço
    

    }
}
