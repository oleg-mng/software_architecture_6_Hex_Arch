package org.inwork;

import org.inwork.Adapters.ConsolePrinter;
import org.inwork.Adapters.MovieReviewsRepo;
import org.inwork.Adapters.UserCommand;
import org.inwork.Application.IFetchMovieReviews;
import org.inwork.Application.IPrintMovieReviews;
import org.inwork.Application.IUserInput;
import org.inwork.Application.MovieUser;
import org.inwork.Domain.MovieSearchRequest;

public class Main {
    public static void main(String[] args) {
        IFetchMovieReviews fetchMovieReviews = new MovieReviewsRepo();
        IPrintMovieReviews printMovieReviews = new ConsolePrinter();
        IUserInput userCommand = new UserCommand(fetchMovieReviews, printMovieReviews);
        MovieUser movieUser = new MovieUser(userCommand);

        MovieSearchRequest starWarsRequest = new MovieSearchRequest("StarWars");
        MovieSearchRequest starTrackRequest = new MovieSearchRequest("StarTrack");

        System.out.println("Displaying reviews for movie " + starTrackRequest.getMovieName());
        movieUser.processInput(starTrackRequest);
        System.out.println("Displaying reviews for movie " + starWarsRequest.getMovieName());
        movieUser.processInput(starWarsRequest);
    }
}