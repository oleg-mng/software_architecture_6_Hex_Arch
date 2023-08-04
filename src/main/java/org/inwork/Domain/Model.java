package org.inwork.Domain;

import org.inwork.Application.MovieApp;

public class Model {
    private MovieApp movieApp;

    public Model(MovieApp movieApp) {

        this.movieApp = movieApp;
    }

    public void run(MovieSearchRequest movieSearchRequest) {

        this.movieApp.accept(movieSearchRequest);
    }
}
