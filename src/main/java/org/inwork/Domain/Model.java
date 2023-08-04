package org.inwork.Domain;

import org.inwork.Application.MovieApp;

/**
 * слой - ядро
 * создаем поле класса MovieApp и метод запуска run, который запускает метод accept из класса MovieApp
 */

public class Model {
    private MovieApp movieApp;

    public Model(MovieApp movieApp) {

        this.movieApp = movieApp;
    }

    public void run(MovieSearchRequest movieSearchRequest) {

        this.movieApp.accept(movieSearchRequest);
    }
}
