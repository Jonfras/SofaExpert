package net.htlgkr.krejo.sofaexpert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.squareup.picasso.Picasso;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    private final String topUrl = "http://image.tmdb.org/t/p/w154";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JsonNode jsonNode = null;
        try {
           jsonNode = Json.parse(getAssets().open("movies.json"));
        } catch (IOException e) {
            System.err.println("jsonNode konnte nicht erstellt werden");
        }


        Movie movie = null;
        try {
            movie = Json.fromJson(jsonNode, Movie.class);
        } catch (JsonProcessingException e) {
            System.err.println("object konnte nicht erstellt werden");
        }

        System.out.println(jsonNode + " " +movie);
    }
}