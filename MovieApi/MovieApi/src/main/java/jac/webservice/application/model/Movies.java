package jac.webservice.application.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class Movies {
    private Long id;
    private String title;
    private String genre;
    private Integer year;
    private Float rating;
    private String director;
    private String cast;
    private String picName;
}
