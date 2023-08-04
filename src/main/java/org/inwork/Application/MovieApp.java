package org.inwork.Application;

import org.inwork.Domain.MovieReview;
import org.inwork.Domain.MovieSearchRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Создаем класс MovieApp с полями интерфейсов IFetchMovieReviews и IPrintMovieReviews
 * создаем конструктор с двумя параметрами
 *
 * используем метод filterRandomReviews для корректировки листа List<MovieReview>
 *
 * используем метод getRandomElement для получения рандомного номера
 */

public class MovieApp {
    private IFetchMovieReviews fetchMovieReviews;
    private IPrintMovieReviews printMovieReviews;
    private static Random rand = new Random();

    public MovieApp(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        this.fetchMovieReviews = fetchMovieReviews;
        this.printMovieReviews = printMovieReviews;
    }

    private List<MovieReview> filterRandomReviews(List<MovieReview> movieReviewList) {
        List<MovieReview> result = new ArrayList();

        for (int index = 0; index < 5 && movieReviewList.size() >= 1; ++index) {
            int randomIndex = this.getRandomElement(movieReviewList.size());
            MovieReview movieReview = (MovieReview) movieReviewList.get(randomIndex);
            movieReviewList.remove(movieReview);
            result.add(movieReview);
        }

        return result;
    }

    private int getRandomElement(int size) {

        return rand.nextInt(size);
    }

    public void accept(MovieSearchRequest movieSearchRequest) {
        List<MovieReview> movieReviewList = this.fetchMovieReviews.fetchMovieReviews(movieSearchRequest);
        List<MovieReview> randomReviews = this.filterRandomReviews(new ArrayList(movieReviewList));
        this.printMovieReviews.writeMovieReviews(randomReviews);
    }
}
