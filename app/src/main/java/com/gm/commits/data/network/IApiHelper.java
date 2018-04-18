package com.gm.commits.data.network;

import com.gm.commits.data.network.model.CommitModel;

import java.util.List;

/**
 * Created by ryellap on 4/17/18.
 */

public interface IApiHelper {

    public void getData(onDataReceived onDataReceived);

    public interface onDataReceived {
        public  void onSuccess(List<CommitModel> models);

    }
}
