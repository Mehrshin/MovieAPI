package jac.webservice.MovieApi.service;

import jac.webservice.MovieApi.dto.MovieDTO;
import jac.webservice.MovieApi.adapter.MovieAdapter;
import jac.webservice.MovieApi.model.Movie;
import jac.webservice.MovieApi.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieService {

    @Autowired
    private MovieRepository repository;
    @Autowired
    MovieAdapter movieAdapter;
    public List<MovieDTO> getAllMovies() {
        return repository.getAllMovies();
    }

    public MovieDTO getMovieById(Long movieId) throws Exception {
        MovieDTO movieDTO = repository.getMovieById(movieId);
        if (movieDTO == null) {
            throw new Exception("There is no movie found with the id="+ movieId);
        }
        return movieDTO;
    }

    public MovieDTO getMovieInformation(String movieTitle) throws Exception {
        MovieDTO movieDTO=  movieAdapter.getMovieInformation((movieTitle));
        if(movieDTO == null){
            throw new Exception("There is no movie found with the name = " + movieTitle);
        }
        return movieDTO;
    }

    public Long createMovie(Movie movie) {
        System.out.println(movie);
        return 1L;
    }

    public MovieDTO getMovieByName(String movieName) {
        return repository.getMovieByName(movieName);
    }

    public void updateMovie(Long movieId, Movie movie) {

    }

    public void deleteMovie(Long movieId) {

    }


}
