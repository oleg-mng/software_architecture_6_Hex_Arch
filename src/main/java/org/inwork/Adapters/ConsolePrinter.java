package org.inwork.Adapters;

import org.inwork.Application.IPrintMovieReviews;
import org.inwork.Domain.MovieReview;

import java.util.List;

/**
 * Для обработки запросов должны быть адаптеры, соответствующие портам.
 * данный адаптер необходим для вывода инфо
 */

public class ConsolePrinter implements IPrintMovieReviews {
    public ConsolePrinter() {
    }

    public void writeMovieReviews(List<MovieReview> movieReviewList) {
        movieReviewList.forEach((movieReview) -> {
            System.out.println(movieReview.toString());
        });
    }
}
