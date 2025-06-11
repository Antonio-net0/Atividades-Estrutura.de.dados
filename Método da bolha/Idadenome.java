package Bumble_Sorte;

import java.util.Scanner;

public class Idadenome {

    int idade;
    String nome;

    public Idadenome(String nome, int idade) {
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
            Idadenome aux;
            for(int cont = 0; cont < v.length-1; cont++){
                for(int cont2= cont +1; cont2 < v.length; cont2++){
                    if(v[cont].idade>v[cont2].idade){
                        aux = v[cont];
                        v[cont]=v[cont2];
                        v[cont2]=aux;
                    }
                }
            }
        }
        public static void ordenarPorNome(Idadenome[] t){
            Idadenome aux;
            for(int cont = 0; cont < t.length-1; cont++) {
                for (int cont2 = cont + 1; cont2 < t.length; cont2++) {
                    if(t[cont].nome.compareTo(t[cont2].nome)>0){
                        //>0 primeiro maior que segundo
                        //<0 primeiro menor que segundo
                        aux= t[cont];
                        t[cont]= t[cont2];
                        t[cont2]=aux;
                    }
                }
            }
        }
        public static void main (String[]args){
            Scanner ler = new Scanner(System.in);
            Idadenome[] selecionar = new Idadenome[5];
            Idadenome[] selecionarN=new Idadenome[5];
            for (int i = 0; i < selecionar.length; i++){
                    System.out.println("Insira nome: ");
                    String nome = ler.nextLine();
                    System.out.println("Insira idade: ");
                    int idade = ler.nextInt();
                    ler.nextLine();
                    selecionar[i]=new Idadenome(nome, idade);
                    selecionarN[i]=new Idadenome(nome,idade);
            }
            ordenarPorNome(selecionarN);
            ordenarPorIdade(selecionar);
            for (int i = 0; i < selecionar.length; i++) {
                System.out.println("Ordenção de idades ");
                System.out.println("vet[" + i + "] = " + selecionar[i]);
                System.out.println("Ordenação de nomes: " );
                System.out.println("vet[" + i + "] = " + selecionarN[i]);
            }
            ler.close();
        }

    }




