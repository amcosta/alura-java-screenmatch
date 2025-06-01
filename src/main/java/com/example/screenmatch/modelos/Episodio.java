package com.example.screenmatch.modelos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Episodio {

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private int duracaoEmMinutos;

    @Getter
    @Setter
    private String descricao;
}
