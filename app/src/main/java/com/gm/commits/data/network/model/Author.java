package com.gm.commits.data.network.model;

/**
 * Created by ryellap on 4/17/18.
 */


public class Author {

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return
                "Author{" +
                        ",name = '" + name + '\'' +
                        "}";
    }
}