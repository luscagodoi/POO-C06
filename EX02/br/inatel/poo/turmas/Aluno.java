package br.inatel.poo.turmas;

public class Aluno {
    private String nome;
    private int matricula;
    private double[] notas;

    public Aluno(String nome, int matricula, double[] notas){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double calculaMedia(){
        double somaNota = 0;
        for(double nota : notas){
            somaNota+=nota;
        }

        return somaNota/notas.length;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }
}

