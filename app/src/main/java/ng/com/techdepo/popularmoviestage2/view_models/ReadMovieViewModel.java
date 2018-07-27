package ng.com.techdepo.popularmoviestage2.view_models;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

import ng.com.techdepo.popularmoviestage2.database.AppDatabase;
import ng.com.techdepo.popularmoviestage2.database.MovieEntity;

public class ReadMovieViewModel extends AndroidViewModel {

    private LiveData<List<MovieEntity>> movies;

    public ReadMovieViewModel(@NonNull Application application) {
        super(application);

        AppDatabase database = AppDatabase.getInstance(this.getApplication());

        movies = database.movieDAO().getAllMovies();
    }

    public LiveData<List<MovieEntity>> getMovies() {
        return movies;
    }
}
