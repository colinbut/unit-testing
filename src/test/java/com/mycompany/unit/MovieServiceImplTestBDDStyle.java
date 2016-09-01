/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.unit;

import com.mycompany.unit.model.Movie;
import com.mycompany.unit.service.MovieService;
import com.mycompany.unit.service.MovieServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;

/**
 * @author colin
 */
public class MovieServiceImplTestBDDStyle {

    private MovieService movieService;

    @Before
    public void setUp() {
        movieService = new MovieServiceImpl();
    }


    @Test
    public void givenMovieDatabaseHasMovies_whenGettingListOfMovies_thenReturnListOfMovies() {
        List<Movie> movies = movieService.getMovieList();
        assertFalse(movies.isEmpty());
    }

    @Test
    public void givenANewMovieToAdd_whenAddingNewMovie_thenAddNewMovie() {
        movieService.addNewMovie(new Movie(1, "21", 2008));
    }


}
