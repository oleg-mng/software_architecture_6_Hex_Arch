package org.inwork.Adapters;

import org.inwork.Application.IFetchMovieReviews;
import org.inwork.Application.IPrintMovieReviews;
import org.inwork.Application.IUserInput;
import org.inwork.Application.MovieApp;
import org.inwork.Domain.Model;
import org.inwork.Domain.MovieSearchRequest;

/**
 * Для обработки запросов должны быть адаптеры, соответствующие портам.
 * данный адаптер необходим для ввода комманд от пользователя
 * Используем интерфейс получения команд (алгоритм) из слоя Application
 *
 *
 * Пользователь будет взаимодействовать с приложением через интерфейс IUserInput.
 * Реализация будет использовать Model.run и делегировать выполнение
 */

public class UserCommand implements IUserInput {
    private Model model;

    public UserCommand(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }

    public void handleUserInput(Object userCommand) {

        this.model.run((MovieSearchRequest)userCommand);
    }
}
