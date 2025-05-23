package Matrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Grupo[][] grupos = new Grupo[2][2];
        Scanner sc = new Scanner(System.in);

        for (int turma = 0; turma < 2; turma++) {
            for (int grupo = 0; grupo < 2; grupo++) {
                System.out.println("Turma " + turma + ", Grupo " + grupo);

                System.out.print("Número do grupo: ");
                int numero = sc.nextInt();
                sc.nextLine();

                System.out.print("Tema do trabalho: ");
                String tema = sc.nextLine();

                Aluno[] componentes = new Aluno[3];

                for (int i = 0; i < 3; i++) {
                    System.out.println("Aluno " + (i + 1) + ":");

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine();

                    System.out.print("Nota escrita: ");
                    double escrita = sc.nextDouble();

                    System.out.print("Nota apresentação: ");
                    double apresentacao = sc.nextDouble();
                    sc.nextLine(); // Limpa o buffer

                    Nota nota = new Nota(escrita, apresentacao);
                    Aluno aluno = new Aluno(nome, matricula, nota);
                    componentes[i] = aluno;
                }

                grupos[turma][grupo] = new Grupo(numero, tema, componentes);
            }
        }
        for (int turma = 0; turma < 2; turma++) {
            for (int grupo = 0; grupo < 2; grupo++) {
                System.out.println(grupos[turma][grupo]);

            }
        }

    }
}
