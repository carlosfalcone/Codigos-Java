package p1_banco;
import p0_interfaces.Iconta;

public abstract class Conta implements Iconta {
    
    private static final int AGENCIA = 1;
    private static int NUMERO_SEQUENCIAL = 1;

    protected int agencia;
    protected int numero_conta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA;
        this.numero_conta = NUMERO_SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Iconta conta_destino) {
        this.sacar(valor);
        conta_destino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero da conta: %d", this.numero_conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public String toString() {
        return "Conta " + numero_conta;
    }



}
