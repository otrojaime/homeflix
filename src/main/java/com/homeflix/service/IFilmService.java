package com.homeflix.service;

import com.homeflix.model.Film;
import java.util.List;

public interface IFilmService {   
    List<Film> listarFilms();
    List<Film> listarFilmsPorCategoria(Integer categoryId);
    List<Film> listarFilmsPorTitulo(String title);
    List<Film> listarFilmsPorTituloYCategoria(String title, Integer categoryId);
}
