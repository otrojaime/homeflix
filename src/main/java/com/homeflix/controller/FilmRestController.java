package com.homeflix.controller;

import com.homeflix.model.Film;
import com.homeflix.service.impl.FilmService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class FilmRestController {
   
    @Autowired
    private FilmService filmService;
    
    /* http://localhost:8080/api/v1/films */
    @GetMapping("/films")
    public List<Film> home() {
        return filmService.listarFilms();
    }
    
    /* http://localhost:8080/api/v1/films/search?categoryId=&title= */
    @GetMapping("/films/search")
    public List<Film> search(@RequestParam(value = "categoryId", defaultValue = "0") Integer categoryId, 
                            @RequestParam(value = "title") String title) {
        return filmService.listarFiltroCompleto(title, categoryId);
    }
}
