package org.inwork.Adapters;

import org.inwork.Application.IFetchMovieReviews;
import org.inwork.Domain.MovieReview;
import org.inwork.Domain.MovieSearchRequest;

import java.util.*;

/**
 * Для обработки запросов должны быть адаптеры, соответствующие портам.
 * данный адаптер необходим для хранения отзывов (db)
 * Используем интерфейс получения отзывов (алгоритм) из слоя Application
 * в методе initialize() мы инициализируем абстрактную db
 * в конструкторе по умолчанию сразу задействуем данный метод
 */

public class MovieReviewsRepo implements IFetchMovieReviews {
    private Map<String, List<MovieReview>> movieReviewMap;

    public MovieReviewsRepo() {

        this.initialize();
    }

    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest) {
        return (List) Optional.ofNullable((List) this.movieReviewMap.get(movieSearchRequest.getMovieName())).
                orElse(new ArrayList());
    }

    private void initialize() {
        this.movieReviewMap = new HashMap();
        this.movieReviewMap.put("StarWars", Collections.singletonList(new MovieReview("1", 7.5, "Good")));
        this.movieReviewMap.put("StarTrack", Arrays.asList(new MovieReview("1", 9.5, "Excellent"),
                new MovieReview("2", 8.5, "Good")));
    }
}
