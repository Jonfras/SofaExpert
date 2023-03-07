package net.htlgkr.krejo.sofaexpert;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.time.LocalDate;
import java.util.Date;

public class Movie {
    private static final String TOP_URL = "http://image.tmdb.org/t/p/w154";

    private String title;
    private double vote_average;
    private String poster_path;
    private LocalDate release_date;
    private String overview;

    public Movie(String title, double vote_average, String poster_path, LocalDate release_date, String overview) {
        this.title = title;
        this.vote_average = vote_average;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.overview = overview;
    }

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getVote_average() {
        return vote_average;
    }

    public void setVote_average(double vote_average) {
        this.vote_average = vote_average;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public LocalDate getRelease_date() {
        return release_date;
    }

    public void setRelease_date(LocalDate releaseDate) {
        this.release_date = releaseDate;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    @Override
    public String toString() {
        return title + " " + vote_average + " " + poster_path + " " + release_date + "!";
    }

    public String createUrl(){
        return TOP_URL + poster_path;
    }
}
