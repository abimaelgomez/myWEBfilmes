package com.br.myWEBfilmes.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import javax.persistence.Entity;


@AllArgsConstructor // cria todos os Atributos dos construtores
@Builder //criando um objeto de forma simples
@Data // cria todos getter e setters e usar equals e hashcode
@NoArgsConstructor // cria construtor vazio para criação de objetos
public class FilmeOMDB {
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Year")
    private String year;
    @JsonProperty("Rated")
    private String rated;
    @JsonProperty("Released")
    private String released;
    @JsonProperty("Runtime")
    private String runtime;
    @JsonProperty("Genre")
    private String genre;
    @JsonProperty("Director")
    private String director;
    @JsonProperty("Plot")
    private String plot;
    @JsonProperty("Awards")
    private String awards;
    @JsonProperty("Metascore")
    private String metaScore;
    @JsonProperty("BoxOffice")
    private String boxOffice;
}

