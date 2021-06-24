package com.app.mywikiapp.Model;

import com.google.gson.annotations.SerializedName;

public class SearchResults {

    @SerializedName("batchcomplete")
    private String batchcomplete;

    @SerializedName("continue")
    private Continue continueObj;

    @SerializedName("query")
    private Query query;

    public String getBatchcomplete ()
    {
        return batchcomplete;
    }

    public void setBatchcomplete (String batchcomplete)
    {
        this.batchcomplete = batchcomplete;
    }

    public Continue getContinue ()
    {
        return continueObj;
    }

    public void setContinue (Continue continueObj)
    {
        this.continueObj = continueObj;
    }

    public Query getQuery ()
    {
        return query;
    }

    public void setQuery (Query query)
    {
        this.query = query;
    }

    @Override
    public String toString()
    {
        return "SearchResults [batchcomplete = "+batchcomplete+", continue = "+continueObj+", query = "+query+"]";
    }
}
