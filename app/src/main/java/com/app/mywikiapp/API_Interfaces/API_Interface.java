package com.app.mywikiapp.API_Interfaces;

import com.app.mywikiapp.Model.SearchResults;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API_Interface {

    String BASE_URL = "https://en.wikipedia.org//w/";

    @GET("api.php?action=query&format=json&prop=pageimages%7Cpageterms&generator=prefixsearch&redirects=1&formatversion=2&piprop=thumbnail&pithumbsize=50&pilimit=10&wbptterms=description&gpssearch=Sachin+T&gpslimit=10")
    Call<SearchResults> getSearchResults();
}
