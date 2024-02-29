package jac.webservice.application.repository;

import jac.webservice.application.model.Movies;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MoviesRowMapper implements RowMapper<Movies> {
    @Override
    public Movies mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Movies.builder().id(rs.getLong("id")).
                title(rs.getString("title")).
                genre(rs.getString("genre")).
                year(rs.getInt("year")).
                rating(rs.getFloat("rating")).
                director(rs.getString("director")).
                cast(rs.getString("cast")).
                picName(rs.getString("pic_name")).
                build();
    }
}
