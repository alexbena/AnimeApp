
package com.example.alex.retrofitapp.AnimeListPojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StreamingLinks {

    @SerializedName("links")
    @Expose
    private Links_________ links;

    public Links_________ getLinks() {
        return links;
    }

    public void setLinks(Links_________ links) {
        this.links = links;
    }

}
