package com.gm.commits.data.network.model;

/**
 * Created by ryellap on 4/17/18.
 */

public class CommitModel {

    private String message;
    private String author;
    private String sha;

    public CommitModel(String message, String author, String sha) {
        this.message = message;
        this.author = author;
        this.sha = sha;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    @Override
    public String toString() {
        return "CommitModel{" +
                "message='" + message + '\'' +
                ", author='" + author + '\'' +
                ", sha='" + sha + '\'' +
                '}';
    }
}
