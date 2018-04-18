package com.gm.commits.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.gm.commits.R;
import com.gm.commits.data.network.model.CommitModel;
import com.gm.commits.ui.adapters.CommitsAdapter;

import java.util.List;


public class MainActivity extends AppCompatActivity implements IView {

    Presenter presenter;
    RecyclerView recyclerView;
    Button getDataBtn;
    CommitsAdapter commitsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        getDataBtn = findViewById(R.id.getDataBtn);

        presenter = new Presenter(this);
    }

    @Override
    public void onResponseReceived(List<CommitModel> models) {
        commitsAdapter= new CommitsAdapter(this,models);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(commitsAdapter);
    }

    public void handleClick(View view) {
        presenter.onButtonClicked();
    }
}
