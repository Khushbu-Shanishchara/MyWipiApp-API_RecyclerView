package com.app.mywikiapp.Model;

import com.google.gson.annotations.SerializedName;

public class Terms
{
    @SerializedName("description")
    private String[] description;

    public String[] getDescription ()
    {
        return description;
    }

    public void setDescription (String[] description)
    {
        this.description = description;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [description = "+description+"]";
    }
}
