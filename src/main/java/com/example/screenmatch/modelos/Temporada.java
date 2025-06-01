package com.example.screenmatch.modelos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Temporada implements Duracao {

    @Setter
    @Getter
    private int numero;

    @Setter
    @Getter
    private List<Episodio> episodios;

    @Override
    public int duracao() {
        var duracao = 0;
        for (Episodio episodio : this.episodios) {
            duracao += episodio.getDuracaoEmMinutos();
        }
        return duracao;
    }
}
