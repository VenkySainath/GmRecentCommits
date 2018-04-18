package com.gm.commits.data.network.model;


/**
 * Created by ryellap on 4/17/18.
 */


public class ParentsItem{

	private String sha;
	public void setSha(String sha){
		this.sha = sha;
	}
	public String getSha(){
		return sha;
	}
	@Override
 	public String toString(){
		return 
			"ParentsItem{" +
			",sha = '" + sha + '\'' +
			"}";
		}
}