import java.util.Scanner;

public class Ordenar {
    public static int [] ordenarN(int[] v){
        int aux;
        for(int cont = 0; cont < v.length-1; cont++){
            for(int cont2= cont +1; cont2 < v.length; cont2++){
                if(v[cont]>v[cont2]){
                    aux = v[cont];
                    v[cont]=v[cont2];
                    v[cont2]=aux;
                }
            }
        }
        return v;
    }
    public static char [] ordenarL(char[] c ){
        char aux;
        for(int cont = 0; cont < c.length-1; cont++){
            for(int cont2= cont +1; cont2 < c.length; cont2++){
                c[cont] = Character.toLowerCase(c[cont]);
                c[cont2] = Character.toLowerCase(c[cont2]);
                if(c[cont]>c[cont2]){
                    aux = c[cont];
                    c[cont]=c[cont2];
                    c[cont2]=aux;
                }
            }
        }
        return c;
    }
    public static int [] escreverN (int [] b){
        Scanner ler = new Scanner(System.in);
        for(int cont =0; cont< b.length; cont++){
            System.out.println("Insira: ");
            b[cont] = ler.nextInt();
        }
        return b;
    }
    public static char [] escreverL (char [] l){
        Scanner ler = new Scanner(System.in);
        for(int cont =0; cont< l.length; cont++){
            System.out.println("Insira: ");
            l[cont] = ler.next().charAt(0);
        }
        return l;
    }


    public static void main (String[]args){

        int[] numeral = new int[4];
        char[] letral =new char[5];

        // o código necessita da criação de duas novas variaveis, uma vez que se colocar para escrever so o numeral e o letral eles vão mostrar os numeros sem ordem e+
        // os dois metodos não são para escrever.
        int[] numemo = new int[numeral.length];
        char[] letra = new char[letral.length];

        escreverN(numeral);
        escreverL(letral);

        System.out.println("Agora, com as letras!!");

        numemo = ordenarN(numeral);
        letra = ordenarL(letral);
        for (int i = 0; i < numemo.length; i++) {
            System.out.println("vet[" + i + "] = " + numemo[i]);
        }
        for (int i = 0; i < letra.length; i++) {
            System.out.println("vet[" + i + "] = " + letra[i]);
        }
        }
       //ordenar(numeral) retorna somente para o numeral
      // numemo =  ordenarN(numeral) retorna somente para numemo.
    }

