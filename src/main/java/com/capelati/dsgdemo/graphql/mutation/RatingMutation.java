package com.capelati.dsgdemo.graphql.mutation;

import com.capelati.dsgdemo.graphql.model.Rating;
import com.capelati.dsgdemo.graphql.model.RatingInput;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;


@DgsComponent
public class RatingMutation {
    @DgsData(parentType = "Mutation", field = "addRating")
    public Rating addRating(@InputArgument("input") RatingInput ratingInput) {

        System.out.println("Rated " + ratingInput.getTitle() + " with " + ratingInput.getStars() + " stars") ;

        return new Rating(ratingInput.getStars());
    }
}
