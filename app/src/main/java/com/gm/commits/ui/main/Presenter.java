package com.gm.commits.ui.main;

import com.gm.commits.data.DataManager;
import com.gm.commits.data.IDataManager;
import com.gm.commits.data.network.IApiHelper;
import com.gm.commits.data.network.model.CommitModel;

import java.util.List;

/**
 * Created by ryellap on 4/17/18.
 */

public class Presenter  implements IPresenter,IApiHelper.onDataReceived{
    private IView iView;
    private IDataManager iDataManager;

    public Presenter(IView iview) {
        this.iView = iview;
        iDataManager = new DataManager();
    }

    @Override
    public void onButtonClicked() {
        iDataManager.getData(this);
    }

    @Override
    public void onSuccess(List<CommitModel> models) {
        iView.onResponseReceived(models);
    }


}