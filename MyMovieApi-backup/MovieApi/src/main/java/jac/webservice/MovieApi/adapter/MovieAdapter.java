package jac.webservice.MovieApi.adapter;

import jac.webservice.MovieApi.dto.MovieDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
public class MovieAdapter {


    private RestTemplate template = new RestTemplate();

    @Value("${omdbapi.url}")
    private String apiUrl;
    @Value("${omdbapi.apikey}")
    private String apiKey;


//    public MovieDTO getRandomMovie() {
//        MovieDTO movieDTo =  template.getForObject(route, MovieDTO.class);
//        return movieDTo;
//    }

    public MovieDTO getMovieInformation(String movieTitle) {
        final String route = apiUrl.concat("?apikey={apiKey}&t={title}");
        Map<String, String> parameters = new HashMap<>();
        parameters.put("apiKey", apiKey);
        parameters.put("title", movieTitle);
        MovieDTO movieDTO = template.getForObject(route, MovieDTO.class, parameters);
        return movieDTO;
    }
}
