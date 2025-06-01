package com.example.screenmatch;

import java.util.List;

import com.example.screenmatch.modelos.Episodio;
import com.example.screenmatch.modelos.Filme;
import com.example.screenmatch.modelos.Serie;
import com.example.screenmatch.modelos.Temporada;

public class App 
{
    public static void main( String[] args )
    {
        var filme = new Filme();
        filme.setNome("Star Wards");
        filme.setAnoDeLancamento(1978);
        filme.setDuracaoEmMinutos(68);

        System.out.println( filme.exibeFichaTecnica() );

        var breakingBad1Temporada = new Temporada();
        breakingBad1Temporada.setNumero(1);
        breakingBad1Temporada.setEpisodios(List.of(
            new Episodio("episodio 1", 52, "primeiro episodio"),
            new Episodio("episodio 2", 61, "segundo episodio")
        ));

        var breakingBad2Temporada = new Temporada();
        breakingBad2Temporada.setNumero(1);
        breakingBad2Temporada.setEpisodios(List.of(
            new Episodio("episodio 1", 52, "primeiro episodio"),
            new Episodio("episodio 2", 61, "segundo episodio")
        ));

        var breakingBad = new Serie();
        breakingBad.setNome("Braking Bad");
        breakingBad.setAnoDeLancamento(2006);
        breakingBad.setTemporadas(List.of(breakingBad1Temporada, breakingBad2Temporada));

        System.out.println(breakingBad);
        
    }
}
