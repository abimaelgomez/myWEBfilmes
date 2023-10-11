package com.br.myWEBfilmes.service;

import com.br.myWEBfilmes.cliente.FilmeClientOMDBFeign;
import com.br.myWEBfilmes.converter.FilmeConverter;
import com.br.myWEBfilmes.dto.FilmeDTO;
import com.br.myWEBfilmes.model.Filme;
import com.br.myWEBfilmes.repositories.FilmeRepository;
import com.br.myWEBfilmes.vo.FilmeOMDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {

    @Value("${imdb.apiKey}")
    private String apiKey;

    @Autowired
    private FilmeClientOMDBFeign filmeClientFeign;
    @Autowired
    private FilmeRepository filmeRepository;
    @Autowired
    private FilmeConverter filmeConverter;

    public FilmeOMDB getFilme(String tema) {
        return filmeClientFeign.getFilme(tema, apiKey);
    }

    public Filme save(FilmeDTO filmeDTO) {
        Filme filme = filmeConverter.converteParaFilme(filmeDTO);
        return filmeRepository.save(filme);
    }

    public Filme getById(Long id) {
        return filmeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Filme não encontrado"));
    }


}
