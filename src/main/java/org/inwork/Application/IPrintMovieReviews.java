package org.inwork.Application;

import org.inwork.Domain.MovieReview;

import java.util.List;

/**
 * Интерфейс записи листа отзывов по имени request(name)
 */

public interface IPrintMovieReviews {
    void writeMovieReviews(List<MovieReview> var1);
}
