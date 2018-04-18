package com.gm.commits.data.network;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import com.gm.commits.data.network.model.CommitModel;
import com.gm.commits.data.network.model.CommitResponse;
import com.gm.commits.data.network.service.CommitService;
import com.gm.commits.data.network.service.RetrofitInstance;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by ryellap on 4/17/18.
 */

public class ApiHelper implements  IApiHelper {

    @Override
    public void getData(final IApiHelper.onDataReceived onDataReceived) {

        CommitService commitService = RetrofitInstance.getRetrofitInstance().create(CommitService.class);
        Call<List<CommitResponse>> call = commitService.getCommitDetails("2018-03-19");
        Log.d("mylog", "call url: " + call.request().url().toString());


        call.enqueue(new Callback<List<CommitResponse>>() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onResponse(Call<List<CommitResponse>> call, Response<List<CommitResponse>> response) {

                List<CommitModel> models = new ArrayList<>();

                for (CommitResponse commitResponse : response.body()) {
                    models.add(new CommitModel(commitResponse.getCommit().getMessage(), commitResponse.getCommit().getAuthor().getName(), commitResponse.getSha()));
                }
                onDataReceived.onSuccess(models);

            }

            @Override
            public void onFailure(Call<List<CommitResponse>> call, Throwable t) {
                if (t instanceof IOException) {
                    Log.d("ExceptionOfNetwork", "Exception Of Network");
                } else {
                    Log.d("Exception", "Retrofit Exception -> " + (t.getMessage()));
                }

            }
        });

    }
}
