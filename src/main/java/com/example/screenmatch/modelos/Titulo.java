package com.example.screenmatch.modelos;

import lombok.Getter;
import lombok.Setter;

public class Titulo {
    @Setter
    @Getter
    protected String nome;

    @Setter
    @Getter
    protected int anoDeLancamento;

    @Setter
    @Getter
    protected int duracaoEmMinutos;

    @Getter
    protected boolean incluidoNoPlano;

    protected double somaDasAvaliacoes;
    protected int totalDeAvaliacoes;

    public void avaliar(double nota) {
        this.totalDeAvaliacoes++;
        this.somaDasAvaliacoes += nota;
    }

    public double avaliacao() {
        return this.somaDasAvaliacoes / this.totalDeAvaliacoes;
    }
}
