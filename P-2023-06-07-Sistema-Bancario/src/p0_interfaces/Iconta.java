package p0_interfaces;

public interface Iconta {

    public void sacar(double valor);

    public void depositar(double valor);

    public void transferir(double valor, Iconta conta_destino);

    public void imprimirExtrato();
}
