package com.homeflix.service.impl;

import com.homeflix.model.Film;
import com.homeflix.repository.FilmRepository;
import com.homeflix.service.IFilmService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmService implements IFilmService{
    
    @Autowired
    private FilmRepository filmRepository;
    
    @Override
    public List<Film> listarFilms() {
        return filmRepository.listarFilms();
    }

    @Override
    public List<Film> listarFilmsPorCategoria(Integer categoryId) {
        return filmRepository.listarFilmsPorCategoria(categoryId);
    }

    @Override
    public List<Film> listarFilmsPorTitulo(String title) {
        return filmRepository.listarFilmsPorTitulo(title);
    }

    @Override
    public List<Film> listarFilmsPorTituloYCategoria(String title, Integer categoryId) {
        return filmRepository.listarFilmsPorTituloYCategoria(title, categoryId);
    }
    
    public List<Film> listarFiltroCompleto(String title, Integer categoryId) {
        if (title.isEmpty() && categoryId != 0) {
            return listarFilmsPorCategoria(categoryId);
        } else if (!title.isEmpty() && categoryId == 0) {
            return listarFilmsPorTitulo(title);
        } else if (!title.isEmpty() && categoryId != 0) {
            return listarFilmsPorTituloYCategoria(title, categoryId);
        } else {
            return listarFilms();
        }
    }
}
