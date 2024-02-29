package jac.webservice.application.repository;

import jac.webservice.application.model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MoviesRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Movies> getAllMovies() {
        return jdbcTemplate.query("SELECT id, title, genre, year, rating, director, cast, pic_name from Movies_table", new MoviesRowMapper());
    }

    public Movies getMoviesById(Long moviesId) {
        String sqlQuery = "SELECT id, title, genre, year, rating, director, cast, pic_name from Movies_table WHERE id=?";
        return jdbcTemplate.queryForObject(sqlQuery, new MoviesRowMapper(), moviesId);
    }

    public Long saveMovies(Movies movies) {
        String sqlQuery = "INSERT INTO Movies_table(title, genre, year, rating, director, cast, pic_name) VALUES(?,?,?,?,?,?,?)";
        jdbcTemplate.update(sqlQuery, movies.getTitle(), movies.getGenre(), movies.getYear(), movies.getRating(), movies.getDirector(), movies.getCast(), movies.getPicName());
        return jdbcTemplate.queryForObject("SELECT MAX(id) from Movies_table", Long.class);
    }

    public void updateMovies(Long moviesId, Movies movies) {
        String sqlQuery = "UPDATE Movies_table set title =? , genre=? , year=? , rating=? , director=? , cast=? , pic_name = ? where id=?";
        jdbcTemplate.update(sqlQuery, movies.getTitle(), movies.getGenre(), movies.getYear(), movies.getRating(), movies.getDirector(), movies.getCast(), movies.getPicName(), moviesId);
    }

    public void deleteMovies(Long moviesId) {
        String sqlQuery = "DELETE FROM Movies_table where id=?";
        jdbcTemplate.update(sqlQuery, moviesId);
    }
}
