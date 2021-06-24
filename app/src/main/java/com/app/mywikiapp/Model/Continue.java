package com.app.mywikiapp.Model;

import com.google.gson.annotations.SerializedName;

public class Continue
{
    @SerializedName("continue")
    private String continueStr;

    @SerializedName("gpsoffset")
    private String gpsoffset;

    public String getContinue ()
    {
        return continueStr;
    }

    public void setContinue (String continueStr)
    {
        this.continueStr = continueStr;
    }

    public String getGpsoffset ()
    {
        return gpsoffset;
    }

    public void setGpsoffset (String gpsoffset)
    {
        this.gpsoffset = gpsoffset;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [continue = "+continueStr+", gpsoffset = "+gpsoffset+"]";
    }
}
