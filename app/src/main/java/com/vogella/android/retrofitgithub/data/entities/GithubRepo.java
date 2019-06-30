package com.vogella.android.retrofitgithub.data.entities;

public class GithubRepo {

    public String name;
    public String owner;
    public String url;

    @Override
    public String toString() {
        return(name + " " + url);
    }
}
