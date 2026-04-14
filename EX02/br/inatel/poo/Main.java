package br.inatel.poo;

import br.inatel.poo.turmas.Aluno;
import br.inatel.poo.turmas.Turma;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();
        
        Aluno aluno1 = new Aluno("Sandro", 550, new double[]{16, 12, 14});
        Aluno aluno2 = new Aluno("Gabao", 888, new double[]{13, 15, 15, 9});
        Aluno aluno3 = new Aluno("Bruna", 1010, new double[]{17, 14, 14, 11, 10});

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);

        System.out.println("\n===Lista dos alunos===\n");

        turma.listarAlunos();

        System.out.println("\n===Melhor aluno===\n");

        turma.mostrarMelhorAluno();
    }
}
