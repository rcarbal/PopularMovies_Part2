package com.example.rcarb.popularmovies.Objects;


public class MovieReviewObject {
    private String mAuthorName;
    private String mMovieReview;


    public MovieReviewObject(){
    }

    public void setAuthorName(String name){
        mAuthorName = name;
    }

    public String getAuthorName(){
        return mAuthorName;
    }

    public void setReview(String review){
        mMovieReview = review;
    }

    public String getReview(){
        return mMovieReview;
    }
}
