package org.inwork.Domain;

/**
 * слой - ядро
 * класс с 3 полями (имя, оценка, комментарий) и конструктором отзывов по фильмам
 */

public class MovieReview {
    String movieName;
    double movieScore;
    String remark;

    public MovieReview(String s, double v, String excellent) {
        this.movieName = s;
        this.movieScore = v;
        this.remark = excellent;
    }

    public String toString() {

        return " " + this.movieScore + " " + this.remark;
    }
}
