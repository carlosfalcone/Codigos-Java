public class MinhaClasse {

public static void main (String [] args) {
    String primeiroNome = "Carlos";
    String segundoNome = "Falcone";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); //[nomeCompleto - variável] é diferente de [nomeCompleto() - método ou função]
    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do metodo 'nomeCompleto': " + primeiroNome.concat(" ").concat(segundoNome);
}

    



}