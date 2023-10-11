package com.br.myWEBfilmes.converter;

import com.br.myWEBfilmes.dto.FilmeDTO;
import com.br.myWEBfilmes.model.Filme;
import com.br.myWEBfilmes.vo.FilmeVO;
import org.springframework.stereotype.Component;

@Component
public class FilmeConverter {

    public Filme converteParaFilme(FilmeDTO filmeDTO){
        Filme filme = new Filme();
        filme.setTitle(filmeDTO.getTitle());
        filme.setYear(filmeDTO.getYear());
        filme.setRated(filmeDTO.getRated());
        filme.setReleased(filmeDTO.getReleased());
        filme.setRuntime(filmeDTO.getRuntime());
        filme.setGenre(filmeDTO.getGenre());
        filme.setDirector(filmeDTO.getDirector());
        filme.setPlot(filmeDTO.getPlot());
        filme.setAwards(filmeDTO.getAwards());
        filme.setMetaScore(filmeDTO.getMetaScore());
        filme.setBoxOffice(filmeDTO.getBoxOffice());
        return filme;
    }

    public FilmeVO converteParaFilmeVO(Filme filme){
        FilmeVO filmeVO = new FilmeVO();
        filmeVO.setId(filme.getId());
        filmeVO.setTitle(filme.getTitle());
        filmeVO.setYear(filme.getYear());
        filmeVO.setRated(filme.getRated());
        filmeVO.setReleased(filme.getReleased());
        filmeVO.setRuntime(filme.getRuntime());
        filmeVO.setGenre(filme.getGenre());
        filmeVO.setDirector(filme.getDirector());
        filmeVO.setPlot(filme.getPlot());
        filmeVO.setAwards(filme.getAwards());
        filmeVO.setMetaScore(filme.getMetaScore());
        filmeVO.setBoxOffice(filme.getBoxOffice());
        return filmeVO;
    }

}
