package com.homeflix.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @Column(columnDefinition = "tinyint")
    @JsonIgnore
    private Integer categoryId;
    
    private String name;
    
    @JsonIgnore
    @ManyToMany(mappedBy = "categories", fetch = FetchType.EAGER)
    private List<Film> films;

    public Category() {
    }

    public Category(Integer categoryId, String name, List<Film> films) {
        this.categoryId = categoryId;
        this.name = name;
        this.films = films;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
