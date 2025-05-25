import java.util.Scanner;

public class Ordenar {
    public static void ordenarN(int[] v){
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
    }
    public static void ordenarL(char[] c ){
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
    }
    public static void ordenarLe(String[] t){
        String aux;
        for(int cont = 0; cont < t.length-1; cont++) {
            for (int cont2 = cont + 1; cont2 < t.length; cont2++) {
                 if(t[cont].compareTo(t[cont2])>0){
                    //>0 primeiro maior que segundo
                     // <0 primeiro menor que segundo
                     aux= t[cont];
                     t[cont]= t[cont2];
                     t[cont2]=aux;
                }
            }
        }
    }

    public static void escreverN (int [] b){
        Scanner ler = new Scanner(System.in);
        for(int cont =0; cont< b.length; cont++){
            System.out.println("Insira: ");
            b[cont] = ler.nextInt();
        }
    }
    public static void  escreverL (char [] l){
        Scanner ler = new Scanner(System.in);
        for(int cont =0; cont< l.length; cont++){
            System.out.println("Insira: ");
            l[cont] = ler.next().charAt(0);
        }
    }
    public static void escreverLe(String[] t){
        Scanner ler = new Scanner(System.in);
        for(int cont =0; cont< t.length; cont++) {
            System.out.println("Insira: ");
            t[cont] = ler.nextLine();
        }
    }

    public static void main (String[]args){

        int[] numeral = new int[4];
        char[] letral =new char[5];
        String[] nomeal=new String[3];

        // o código necessita da criação de duas novas variaveis, uma vez que se colocar para escrever so o numeral e o letral eles vão mostrar os numeros sem ordem e+
        // os dois metodos não são para escrever.
        //int[] numemo = new int[numeral.length];
        //char[] letra = new char[letral.length];
        //se ordenar(letral) letral recebe os dados ocorridos na variavel, agr se esse metodo form atribuido a uma variavel, so a variavel recebe

        escreverN(numeral);
        System.out.println("Agora as letras!! ");
        escreverL(letral);
        ordenarL(letral);
        ordenarN(numeral);
        System.out.println("Escreva os nomes: ");
        escreverLe(nomeal);
        ordenarLe(nomeal);

        System.out.println("Agora, com as letras!!");

       // numemo = ordenarN(numeral);
       // letra = ordenarL(letral);
        for (int i = 0; i < numeral.length; i++) {
            System.out.println("Ordenção de números: ");
            System.out.println("vet[" + i + "] = " + numeral[i]);
        }
        for (int i = 0; i < letral.length; i++) {
            System.out.println("Ordenção de letras: ");
            System.out.println("vet[" + i + "] = " + letral[i]);
        }
        for (int i = 0; i < nomeal.length; i++) {
            System.out.println("Ordenção de nomes: ");
            System.out.println("vet[" + i + "] = " + nomeal[i]);
        }
    }
       //ordenar(numeral) retorna somente para o numeral
      // numemo =  ordenarN(numeral) retorna somente para numemo.
}


