package com.example.screenmatch.modelos;

public class Filme extends Titulo {
    
    public String exibeFichaTecnica() {
        var incluso = incluidoNoPlano ? "sim" : "não";

        return String.format("""
                Nome: %s
                Ano de lançamento: %d
                Duração: %dmin
                Incluso no plano: %s
                """, nome, anoDeLancamento, duracaoEmMinutos, incluso);
    }
}