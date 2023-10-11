package com.br.myWEBfilmes.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor // cria todos os Atributos dos construtores
@Builder //criando um objeto de forma simples
@Data // cria todos getter e setters e usar equals e hashcode
@NoArgsConstructor // cria construtor vazio para criação de objetos
@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String title;
    @Column(name = "ano")
    private String year;
    @Column(name = "avaliacao")
    private String rated;
    @Column(name = "lancamento")
    private String released;
    @Column(name = "tempo")
    private String runtime;
    @Column(name = "genero")
    private String genre;
    @Column(name = "diretor")
    private String director;
    @Column(name = "descricao")
    private String plot;
    @Column(name = "premios")
    private String awards;
    @Column(name = "Nota")
    private String metaScore;
    @Column(name = "bilheteria")
    private String boxOffice;
}
