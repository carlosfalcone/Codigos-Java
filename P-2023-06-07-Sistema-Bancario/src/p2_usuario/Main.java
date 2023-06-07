package p2_usuario;
import p1_banco.Cliente;
import p1_banco.ContaCorrente;
import p1_banco.ContaPoupanca;
import p1_banco.Conta;
import p1_banco.Banco;
import java.util.List;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        Cabecalho();

        Cliente usuario = new Cliente();
        usuario.setNome("Falcone");

        Conta cc = new ContaCorrente(usuario);
        Conta poupanca = new ContaPoupanca(usuario);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        usuario.setNome("Stella");

        Conta cc1 = new ContaCorrente(usuario);
        Conta poupanca1 = new ContaPoupanca(usuario);

        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();

        // Acessando a lista de contas
        Banco banco = new Banco();
        banco.setNome("Banco Falcones");

        // Criando a lista de contas
        List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(poupanca);
        contas.add(cc1);
        contas.add(poupanca1);

        // Atribuindo a lista de contas ao objeto Banco
        banco.setContas(contas);

        // Acessando a lista de contas através do método getContas()
        System.out.println("Listagem das contas existentes: ");
        System.out.println(banco.getContas());

    }
    
    public static void Cabecalho() {
        System.out.println("");
        System.out.println("==============================");
        System.out.println("======= BANCO FALCONEs ======= ");
        System.out.println("==============================");
        System.out.println("");
    }
}
