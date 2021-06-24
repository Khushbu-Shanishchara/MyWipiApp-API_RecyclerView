package com.app.mywikiapp.Model;

import com.google.gson.annotations.SerializedName;

public class Pages
{
    @SerializedName("thumbnail")
    private Thumbnail thumbnail;

    @SerializedName("ns")
    private String ns;

    @SerializedName("terms")
    private Terms terms;

    @SerializedName("index")
    private String index;

    @SerializedName("pageid")
    private String pageid;

    @SerializedName("title")
    private String title;

    public Thumbnail getThumbnail ()
    {
        return thumbnail;
    }

    public void setThumbnail (Thumbnail thumbnail)
    {
        this.thumbnail = thumbnail;
    }

    public String getNs ()
    {
        return ns;
    }

    public void setNs (String ns)
    {
        this.ns = ns;
    }

    public Terms getTerms ()
    {
        return terms;
    }

    public void setTerms (Terms terms)
    {
        this.terms = terms;
    }

    public String getIndex ()
    {
        return index;
    }

    public void setIndex (String index)
    {
        this.index = index;
    }

    public String getPageid ()
    {
        return pageid;
    }

    public void setPageid (String pageid)
    {
        this.pageid = pageid;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [thumbnail = "+thumbnail+", ns = "+ns+", terms = "+terms+", index = "+index+", pageid = "+pageid+", title = "+title+"]";
    }
}
