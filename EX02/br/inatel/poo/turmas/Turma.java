package br.inatel.poo.turmas;

import java.util.ArrayList;

public class Turma {
    int quantidadeAlunos = 0;
    ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno novoAluno){
        alunos.add(novoAluno);
        quantidadeAlunos++;
    }

    public void listarAlunos(){
        for(Aluno aluno : alunos){
            System.out.printf("Nome: %s, Matricula: %d, Media: %.2f\n", aluno.getNome(), aluno.getMatricula(), aluno.calculaMedia());
        }
    }

    public void mostrarMelhorAluno(){
        double melhorMedia = 0;
        Aluno melhorAluno = null;

        for(Aluno aluno : alunos){
            if(aluno.calculaMedia()>melhorMedia){
                melhorAluno = aluno;
                melhorMedia = aluno.calculaMedia();
            }
        }

        System.out.printf("Nome: %s, Matricula: %d, Media: %.2f\n", melhorAluno.getNome(), melhorAluno.getMatricula(), melhorAluno.calculaMedia());

    }
}
