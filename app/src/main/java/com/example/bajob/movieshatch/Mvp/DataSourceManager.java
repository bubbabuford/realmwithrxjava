package com.example.bajob.movieshatch.Mvp;

import com.example.bajob.movieshatch.Retrofit.ApiService;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.realm.Realm;

/**
 * Created by bajob on 1/27/2017.
 */
@Singleton
public class DataSourceManager {
    ApiService apiService;
    Realm realmUi;

    @Inject
    public DataSourceManager(ApiService apiService, Realm realmUi) {
        this.apiService = apiService;
        this.realmUi = realmUi;
    }
}
