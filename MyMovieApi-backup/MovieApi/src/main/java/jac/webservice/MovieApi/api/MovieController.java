package jac.webservice.MovieApi.api;

import jac.webservice.MovieApi.dto.MovieDTO;
import jac.webservice.MovieApi.model.Movie;
import jac.webservice.MovieApi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
@CrossOrigin
//@Component
public class MovieController {

    @Autowired
    MovieService service;

//    @GetMapping("/")
//    public MovieDTO getMovieInfo(@RequestParam String movieName) {
//        return service.getMovieInformation(movieName);
//    }

    @GetMapping("/")
    public ResponseEntity<List<MovieDTO>> getAllMovies() {
        return new ResponseEntity<>(service.getAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/find/{movieId}")
    public ResponseEntity<MovieDTO> getMovieById (@PathVariable Long movieId) {
        try {
            MovieDTO movieDTO = service.getMovieById(movieId);
            return new ResponseEntity<>(movieDTO, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/find/")
    public ResponseEntity<MovieDTO> getMovieByName (@RequestParam String movieName) {
        try {
            MovieDTO movieDTO = service.getMovieInformation(movieName);
            return new ResponseEntity<>(movieDTO, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);        }
    }

    @PostMapping("/")
    public Long createMovie(@RequestBody Movie movie){
        return service.createMovie(movie);
    }

    @PutMapping("/find/{movieId}")
    public void updateMovie(@PathVariable Long movieId, @RequestBody Movie movie) {
        service.updateMovie(movieId, movie);
    }

    @DeleteMapping("find/{movieId}")
    public void deleteMovie(@PathVariable Long movieId) {
        service.deleteMovie(movieId);
    }
}
