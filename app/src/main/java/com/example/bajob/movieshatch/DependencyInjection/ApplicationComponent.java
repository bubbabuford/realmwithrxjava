package com.example.bajob.movieshatch.DependencyInjection;

import com.example.bajob.movieshatch.MainActivity;
import com.example.bajob.movieshatch.MoviesHatchApp;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by bajob on 1/26/2017.
 */
@Singleton
@Component(modules = {ApplicationModule.class,NetworkModule.class,RealmModule.class})
public interface ApplicationComponent {
    void inject(MoviesHatchApp app);
    void inject(MainActivity activity);
}
