public class FormatadorCepExemplo {
    
    public static void main(String[] args) {
        String cep_formatado;
        try {
            cep_formatado = formatarCep("2376506");
            System.out.println(cep_formatado);

        } catch (CepInvalidoException e) {
            // e.printStackTrace(); // comentado por mim
            System.out.println("O CEP precisa ter 8 dígitos!");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        // Simulando um cep formatado
        return "23.765-064";
    }
}
