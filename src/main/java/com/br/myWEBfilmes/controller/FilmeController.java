package com.br.myWEBfilmes.controller;

import com.br.myWEBfilmes.converter.FilmeConverter;
import com.br.myWEBfilmes.dto.FilmeDTO;
import com.br.myWEBfilmes.service.FilmeService;
import com.br.myWEBfilmes.vo.FilmeOMDB;
import com.br.myWEBfilmes.vo.FilmeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/filme")
public class FilmeController {
    @Autowired
    private FilmeService filmeService;
    @Autowired
    private FilmeConverter filmeConverter;

    @GetMapping("/omdb/{tema}")
    public ResponseEntity<FilmeOMDB> getFilme(@PathVariable String tema) {
        try {
            FilmeOMDB filmeOMDB = filmeService.getFilme(tema);
            return ResponseEntity.status(HttpStatus.OK).body(filmeOMDB);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping
    public ResponseEntity<FilmeVO> saveFilme(@RequestBody FilmeDTO filmeDTO) {
        try {
            FilmeVO filmeVO = filmeConverter.converteParaFilmeVO(filmeService.save(filmeDTO));

            addHateoas(filmeVO);

            return ResponseEntity.status(HttpStatus.CREATED).body(filmeVO);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<FilmeVO> getById(@PathVariable("id") Long id) {
        try {
            FilmeVO filmeVO = filmeConverter.converteParaFilmeVO(filmeService.getById(id));
            return ResponseEntity.ok(filmeVO);
        } catch (IllegalArgumentException e ) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    private void addHateoas(FilmeVO filmeVO) {
        filmeVO.add(linkTo(methodOn(FilmeController.class).getById(filmeVO.getId()))
                .withSelfRel());
    }
}
