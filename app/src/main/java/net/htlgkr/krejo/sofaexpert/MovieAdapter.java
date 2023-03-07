package net.htlgkr.krejo.sofaexpert;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import org.json.*;
import com.squareup.picasso.*;

import java.util.List;

public class MovieAdapter extends BaseAdapter {
    private List<Movie> movieList;
    private int layoutId;
    private LayoutInflater inflater;
    MovieManager movieManager;
    Context ctx;

    public MovieAdapter(Context ctx, int layoutId, MovieManager movieManager) {
        this.ctx = ctx;
        this.movieManager = movieManager;
        this.movieList = movieManager.getResults();
        this.layoutId = layoutId;
        this.inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return movieList.size();
    }

    @Override
    public Object getItem(int i) {
        return movieList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ImageView view = (ImageView) convertView;
        if (view == null) {
            view = new ImageView(ctx);
        }


        Picasso.get().load(movieManager.getResults().get(i).createUrl()).into(view);
        return view;
    }

}
