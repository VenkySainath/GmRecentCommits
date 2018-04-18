package com.gm.commits.data.network.service;

import com.gm.commits.data.network.model.CommitResponse;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


/**
 * Created by ryellap on 4/17/18.
 */

public interface CommitService {

//Displays those commits in a list with the author, commit hash, and commit message
    @GET("repos/google/dagger/commits")
   Call<List<CommitResponse>> getCommitDetails(@Query("since") String date);

}
