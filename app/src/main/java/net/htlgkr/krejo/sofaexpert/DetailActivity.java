package net.htlgkr.krejo.sofaexpert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    private Movie movie;
    private ImageView imageView;

    private TextView titleTxtView;
    private TextView ratingTxtView;
    private TextView dateTxtView;
    private TextView overviewTxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imageView = findViewById(R.id.detailImageView);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        try {
            movie = Movie.getMovieFromJsonString(bundle.getString("movie"));
            System.out.println("Movie was created in detail activity!");
        } catch (JsonProcessingException e) {
            System.err.println("Movie couldnt be created from bundle extra...");
        }

        titleTxtView = findViewById(R.id.titleTxtView);
        titleTxtView.setText(movie.getTitle());

        ratingTxtView = findViewById(R.id.ratingTxtView);
        ratingTxtView.setText(movie.getVote_average() + " / 10");

        dateTxtView = findViewById(R.id.dateTxtView);
        dateTxtView.setText(movie.getRelease_date().toString());

        overviewTxtView = findViewById(R.id.overviewTxtView);
        overviewTxtView.setText(movie.getOverview());

        Picasso.get().load(movie.createUrl()).into(imageView);
    }
}