package org.inwork.Application;

import org.inwork.Domain.MovieReview;
import org.inwork.Domain.MovieSearchRequest;

import java.util.List;

/**
 * Интерфейс получения листа отзывов
 */

public interface IFetchMovieReviews {
    List<MovieReview> fetchMovieReviews(MovieSearchRequest var1);
}
