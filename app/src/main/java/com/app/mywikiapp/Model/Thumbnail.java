package com.app.mywikiapp.Model;

import com.google.gson.annotations.SerializedName;

public class Thumbnail
{
    @SerializedName("width")
    private String width;

    @SerializedName("source")
    private String source;

    @SerializedName("height")
    private String height;

    public String getWidth ()
    {
        return width;
    }

    public void setWidth (String width)
    {
        this.width = width;
    }

    public String getSource ()
    {
        return source;
    }

    public void setSource (String source)
    {
        this.source = source;
    }

    public String getHeight ()
    {
        return height;
    }

    public void setHeight (String height)
    {
        this.height = height;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [width = "+width+", source = "+source+", height = "+height+"]";
    }
}
