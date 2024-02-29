package jac.webservice.application.api;

import jac.webservice.application.model.Movies;
import jac.webservice.application.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@CrossOrigin

public class MoviesController {
    @Autowired
    private MoviesService service;

    @GetMapping("/")
    public List<Movies> getAll() {
        return service.getAllMovies();
    }

    @GetMapping("/{moviesId}")
    public Movies getMoviesById(@PathVariable Long moviesId) {
        return service.getMoviesById(moviesId);
    }

    @PostMapping("/")
    public ResponseEntity<Long> createMovies(@RequestBody Movies movies){
        try {
            return new ResponseEntity<>(service.saveMovies(movies), HttpStatus.CREATED);
        } catch (Exception exception){
            return new ResponseEntity(exception.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/find/{moviesId}")
    public void updateMovies(@PathVariable Long moviesId, @RequestBody Movies movies) {
        service.updateMovies(moviesId, movies);
    }

    @DeleteMapping("/find/{moviesId}")
    public void deleteMovies(@PathVariable Long moviesId) {
        service.deleteMovies(moviesId);
    }
}
