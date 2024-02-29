package jac.webservice.MovieApi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieDTO {

     private Long id;
     @JsonProperty("Title")
     private String title;
     @JsonProperty("Genre")
     private String genre;
     @JsonProperty("Year")
     private int year;
     @JsonProperty("imdbRating")
     private double rating;
     @JsonProperty("Director")
     private String director;
     @JsonProperty("Actors")
     private String cast;
}
