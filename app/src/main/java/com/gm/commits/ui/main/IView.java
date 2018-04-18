package com.gm.commits.ui.main;

import com.gm.commits.data.network.model.CommitModel;

import java.util.List;

/**
 * Created by ryellap on 4/17/18.
 */

public interface IView {
    public void onResponseReceived(List<CommitModel> models);
}