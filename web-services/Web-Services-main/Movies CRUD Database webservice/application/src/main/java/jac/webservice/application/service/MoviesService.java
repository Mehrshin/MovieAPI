package jac.webservice.application.service;

import jac.webservice.application.model.Movies;
import jac.webservice.application.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MoviesService {
    @Autowired
    private MoviesRepository repository;

    public List<Movies> getAllMovies() {
        return repository.getAllMovies();
    }

    public Movies getMoviesById(Long moviesId) {
        return repository.getMoviesById(moviesId);
    }

    public Long saveMovies(Movies movies) {
        //whenever the input relates to a logic, we add the validation in service layer

        return repository.saveMovies(movies);
    }

    public void updateMovies(Long moviesId, Movies movies) {
        repository.updateMovies(moviesId, movies);
    }

    public void deleteMovies(Long moviesId) {
        repository.deleteMovies(moviesId);
    }
}
