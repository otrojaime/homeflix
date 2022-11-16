package com.homeflix.repository;

import com.homeflix.model.Film;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {
    
    @Query(value = "SELECT * FROM film JOIN film_category ON film.film_id = film_category.film_id"
            + " JOIN category ON category.category_id = film_category.category_id", nativeQuery = true)
    List<Film> listarFilms();
    
    
    @Query(value = "SELECT * FROM film JOIN film_category ON film.film_id = film_category.film_id"
            + " JOIN category ON category.category_id = film_category.category_id "
            + "WHERE category.category_id = ?1", nativeQuery = true)
    List<Film> listarFilmsPorCategoria(Integer categoryId);
    
    @Query(value = "SELECT * FROM film WHERE title LIKE %?1%", nativeQuery = true)
    List<Film> listarFilmsPorTitulo(String title);
    
    @Query(value = "SELECT * FROM film JOIN film_category ON film.film_id = film_category.film_id"
            + " JOIN category ON category.category_id = film_category.category_id "
            + "WHERE film.title LIKE %?1% AND category.category_id = ?2", nativeQuery = true)
    List<Film> listarFilmsPorTituloYCategoria(String title, Integer categoryId);
}
