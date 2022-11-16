package com.homeflix.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "film")
public class Film {
    
    @Id
    @Column(columnDefinition = "smallint")
    private Integer filmId;
    
    private String title;
    
    @Column(columnDefinition = "smallint")
    private Integer length;
    
    @Column(columnDefinition = "enum")
    private String rating;
    
    @Column(columnDefinition = "decimal")
    private Double rentalRate;
    
    @Column(columnDefinition = "tinyint")
    private Integer rentalDuration;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "film_category", joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;

    public Film() {
    }

    public Film(Integer filmId, String title, Integer length, String rating, Double rentalRate, Integer rentalDuration, List<Category> categories) {
        this.filmId = filmId;
        this.title = title;
        this.length = length;
        this.rating = rating;
        this.rentalRate = rentalRate;
        this.rentalDuration = rentalDuration;
        this.categories = categories;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(Double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Integer getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Integer rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
