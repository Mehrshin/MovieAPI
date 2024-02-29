package jac.webservice.MovieApi.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class Movie {
    private Long id;
    private String title;
    private String genre;
    private int year;
    private double rating;
    private String director;
    private String cast;
}
