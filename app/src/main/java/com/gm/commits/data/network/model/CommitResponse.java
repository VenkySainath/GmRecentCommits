package com.gm.commits.data.network.model;

import java.util.List;

/**
 * Created by ryellap on 4/17/18.
 */

public class CommitResponse{

	private Author author;
	private Commit commit;
	private String sha;
	private List<ParentsItem> parents;



	public void setAuthor(Author author){
		this.author = author;
	}

	public Author getAuthor(){
		return author;
	}

	public void setCommit(Commit commit){
		this.commit = commit;
	}

	public Commit getCommit(){
		return commit;
	}

	public void setSha(String sha){
		this.sha = sha;
	}

	public String getSha(){
		return sha;
	}

	public void setParents(List<ParentsItem> parents){
		this.parents = parents;
	}

	public List<ParentsItem> getParents(){
		return parents;
	}

	@Override
 	public String toString(){
		return 
			"CommitResponse{" +
			",author = '" + author + '\'' +
			",commit = '" + commit + '\'' +
			",sha = '" + sha + '\'' +
			",parents = '" + parents + '\'' + 
			"}";
		}
}