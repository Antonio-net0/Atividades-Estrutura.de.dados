package Nome.e;

import java.util.Scanner;

public class Idadenome {

    int idade;
    String nome;

    public Idadenome(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Idadenome{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }
    public static void ordenarPorIdade(Idadenome[] v){
            int aux;
            for(int cont = 0; cont < v.length-1; cont++){
                for(int cont2= cont +1; cont2 < v.length; cont2++){
                    if(v[cont].idade>v[cont2].idade){
                        aux = v[cont].idade;
                        v[cont].idade=v[cont2].idade;
                        v[cont2].idade=aux;
                    }
                }
            }
        }
        public static void ordenarPorNome(Idadenome[] t){
            String aux;
            for(int cont = 0; cont < t.length-1; cont++) {
                for (int cont2 = cont + 1; cont2 < t.length; cont2++) {
                    if(t[cont].nome.compareTo(t[cont2].nome)>0){
                        //>0 primeiro maior que segundo
                        // <0 primeiro menor que segundo
                        aux= t[cont].nome;
                        t[cont].nome= t[cont2].nome;
                        t[cont2].nome=aux;
                    }
                }
            }
        }
        public static void main (String[]args){
            Idadenome[] selecionar = new Idadenome[5];
            for (int i = 0; i < selecionar.length; i++){
                Scanner ler = new Scanner(System.in);
                    System.out.println("Insira nome: ");
                    String nome = ler.nextLine();
                    System.out.println("Insira idade: ");
                    int idade = ler.nextInt();
                    selecionar[i]=new Idadenome(idade, nome);
            }
            ordenarPorNome(selecionar);
            ordenarPorIdade(selecionar);
            for (int i = 0; i < selecionar.length; i++) {
                System.out.println("Ordenção de idades e nomes em ordem crescente: ");
                System.out.println("vet[" + i + "] = " + selecionar[i].idade + "  " + selecionar[i].nome);
            }
        }
    }




