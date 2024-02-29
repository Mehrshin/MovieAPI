package jac.webservice.MovieApi.repository;

import jac.webservice.MovieApi.dto.MovieDTO;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieRowMapper implements RowMapper<MovieDTO> {
    @Override
    public MovieDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        return MovieDTO.builder().id(rs.getLong("id"))
                .title(rs.getString("title"))
                .year(rs.getInt("year"))
                .genre(rs.getString("genre"))
                .cast(rs.getString("cast"))
                .rating(rs.getDouble("rating"))
                .director(rs.getString("director"))
                .build();
    }
}
