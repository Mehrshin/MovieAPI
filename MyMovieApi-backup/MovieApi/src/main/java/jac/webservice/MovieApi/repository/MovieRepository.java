package jac.webservice.MovieApi.repository;

import jac.webservice.MovieApi.dto.MovieDTO;
import jac.webservice.MovieApi.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<MovieDTO> getAllMovies() {
        return jdbcTemplate.query("SELECT id, title, genre, year, rating, director, cast FROM Movies_table", new MovieRowMapper());
    }

    public MovieDTO getMovieById(Long movieId) {
        try {
            String sql = "SELECT * FROM Movies_table WHERE id=?";
            return jdbcTemplate.queryForObject(sql, new MovieRowMapper(), movieId);
        } catch (EmptyResultDataAccessException erdae) {
            return null;
        }
    }

    public MovieDTO getMovieByName(String movieName) {
        try {
            String sql = "SELECT * FROM Movies_table WHERE title LIKE ?";
            return jdbcTemplate.queryForObject(sql, new MovieRowMapper(), movieName);
        }
        catch (EmptyResultDataAccessException erdae){
            return null;
        }

    }


}
