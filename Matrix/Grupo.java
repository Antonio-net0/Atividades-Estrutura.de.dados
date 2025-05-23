package Matrix;

import java.util.Arrays;

public class Grupo {
    int numero;
    String tema;
    Aluno[] componentes;

    public Grupo(int numero, String tema, Aluno[] componentes) {
        this.numero = numero;
        this.tema = tema;
        this.componentes = componentes;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "numero=" + numero +
                ", tema='" + tema + '\'' +
                ", componentes=" + Arrays.toString(componentes) +
                '}';
    }
}