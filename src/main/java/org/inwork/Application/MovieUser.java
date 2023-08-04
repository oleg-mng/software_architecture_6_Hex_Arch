package org.inwork.Application;

import org.inwork.Domain.MovieSearchRequest;

/**
 * в слое Application создаем поле типа IUserInput и конструктор с этим же параметром
 *
 * с помощью метода processInput на поле userInputDriverPort мы поключаем метод
 * handleUserInput (ввода команды пользователем) из класса UserCommand
 */

public class MovieUser {
    private IUserInput userInputDriverPort;

    public MovieUser(IUserInput userInputDriverPort) {

        this.userInputDriverPort = userInputDriverPort;
    }

    public void processInput(MovieSearchRequest movieSearchRequest) {

        this.userInputDriverPort.handleUserInput(movieSearchRequest);
    }
}
