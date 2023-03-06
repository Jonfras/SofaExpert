package net.htlgkr.krejo.sofaexpert;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.time.LocalDate;

public class Movie {
    private String title;
    private double vote_average;
    private String poster_path;
    private LocalDate releaseDate;
    private String overview;

    public Movie(String title, double vote_average, String poster_path, LocalDate releaseDate, String overview) {
        this.title = title;
        this.vote_average = vote_average;
        this.poster_path = poster_path;
        this.releaseDate = releaseDate;
        this.overview = overview;
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

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}
