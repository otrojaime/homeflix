package com.homeflix.controller;

import com.homeflix.service.impl.CategoryService;
import com.homeflix.service.impl.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class FilmController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private FilmService filmService;

    @GetMapping("/home") /* http://localhost:8080/home */
    public String home(Model m) {
        String resultado = "Films encontrados: " + filmService.listarFilms().size(); 
        m.addAttribute("resultado", resultado);
        m.addAttribute("categorias", categoryService.listarCategorias()); 
        m.addAttribute("films", filmService.listarFilms()); 
        return "index";
    }

    @PostMapping("/search") 
    public String search(@RequestParam(value = "categoryId") Integer categoryId,
            @RequestParam(value = "title") String title,
            Model m) {
        String resultado = "Films encontrados: " + filmService.listarFiltroCompleto(title, categoryId).size();
        m.addAttribute("resultado", resultado);
        m.addAttribute("categorias", categoryService.listarCategorias());
        m.addAttribute("films", filmService.listarFiltroCompleto(title, categoryId));
        return "index";
    }
}
