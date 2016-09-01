/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.unit.service;

import com.mycompany.unit.model.Movie;

import java.util.List;

/**
 * @author colin
 */
public interface MovieService {

    List<Movie> getMovieList();
    List<Movie> getMoviesByTitle();
    List<Movie> getMoviesByYear();
    List<Movie> getMoviesByRating();
    void addNewMovie(Movie movie);
    void deleteMovie(Movie movie);
    void updateMovie(Movie movie);

}
