package com.example.screenmatch.modelos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Serie extends Titulo implements Duracao {
    @Getter
    @Setter
    private List<Temporada> temporadas;

    @Override
    public int duracao() {
        var duracao = 0;
        for (Temporada temporada : this.temporadas) {
            duracao += temporada.duracao();
        }
        return duracao;
    }

    @Override
    public String toString() {
        return String.format("""
            Nome: %s
            Ano de lançamento: %d
            Temporadas: %d
            Tempo para maratonar: %d
            """, nome, anoDeLancamento, this.temporadas.size(), this.duracao());
    }
}
