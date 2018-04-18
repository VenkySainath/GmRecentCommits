package com.gm.commits.data;


import com.gm.commits.data.network.ApiHelper;
import com.gm.commits.data.network.IApiHelper;

/**
 * Created by ryellap on 4/17/18.
 */

public class DataManager implements IDataManager {
    IApiHelper iapiHelper;

    public DataManager(){
        iapiHelper = new ApiHelper();
    }


    @Override
    public void getData(IApiHelper.onDataReceived onDataReceived) {
        iapiHelper.getData(onDataReceived);
    }
}
