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

import static org.junit.Assert.assertTrue;

/**
 * @author colin
 */
public class MovieServiceImplTestTestingBehaviour {

    private MovieService movieService;

    @Before
    public void setUp() {
        movieService = new MovieServiceImpl();
    }

    @Test
    public void testGettingListOfMovies_ShouldReturnMovieList() {
        List<Movie> movies = movieService.getMovieList();
        assertTrue(movies.size() > 0);
    }

    @Test
    public void testAddingNewMovie_ShouldAddNewMovie() {

    }

}
