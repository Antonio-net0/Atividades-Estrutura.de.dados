package Matrix;


    public class Aluno {
        String nome;
        String matricula;
        Nota nota;

        public Aluno(String nome, String matricula, Nota nota) {
            this.nome = nome;
            this.matricula = matricula;
            this.nota = nota;
        }

        @Override
        public String toString() {
            return "Aluno{" +
                    "nome='" + nome + '\'' +
                    ", matricula='" + matricula + '\'' +
                    ", nota=" + nota +
                    '}';
        }
    }

