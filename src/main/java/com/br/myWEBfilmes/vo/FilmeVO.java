package com.br.myWEBfilmes.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.Column;
@AllArgsConstructor // cria todos os Atributos dos construtores
@Builder //criando um objeto de forma simples
@Data // cria todos getter e setters e usar equals e hashcode
@NoArgsConstructor // cria construtor vazio para criação de objetos
public class FilmeVO extends RepresentationModel<FilmeVO> {

    private Long id;
    private String title;
    private String year;
    private String rated;
    private String released;
    private String runtime;
    private String genre;
    private String director;
    private String plot;
    private String awards;
    private String metaScore;
    private String boxOffice;
}
