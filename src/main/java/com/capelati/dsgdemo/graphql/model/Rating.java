package com.capelati.dsgdemo.graphql.model;

public class Rating {

    private String title;
    private Integer stars;

    public Rating(String title, Integer stars) {
        this.title = title;
        this.stars = stars;
    }

    public Rating(Integer stars) {
        this.stars = stars;
    }

    public String getTitle() {
        return title;
    }

    public Integer getStars() {
        return stars;
    }
}
