package org.inwork.Domain;

/**
 * слой - ядро
 * класс поиска по имени и возврата имени найденого
 */

public class MovieSearchRequest {
    String request;

    public MovieSearchRequest(String name) {

        this.request = name;
    }

    public String getMovieName() {

        return this.request;
    }
}
