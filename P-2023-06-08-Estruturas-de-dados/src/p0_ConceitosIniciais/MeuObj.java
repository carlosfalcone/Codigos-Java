package p0_ConceitosIniciais;

public class MeuObj {
    Integer num;

    // Metodo construtor
    public MeuObj (Integer num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
    
}
