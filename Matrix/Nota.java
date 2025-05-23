package Matrix;

public class Nota {
    double escrita;
    double apresentacao;

    public Nota(double escrita, double apresentacao) {
        this.escrita = escrita;
        this.apresentacao = apresentacao;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "escrita=" + escrita +
                ", apresentacao=" + apresentacao +
                '}';
    }
}