package com.gm.commits.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gm.commits.R;
import com.gm.commits.data.network.model.CommitModel;

import java.util.List;

/**
 * Created by ryellap on 4/17/18.
 */

public class CommitsAdapter extends RecyclerView.Adapter<CommitsAdapter.ViewHolder> {

    Context context;
    List<CommitModel> commitModelList;

    public CommitsAdapter(Context context, List<CommitModel> commitModelList) {
        this.context = context;
        this.commitModelList = commitModelList;
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_layout, parent, false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CommitModel commitModel = commitModelList.get(position);
        String displayName = "NAME";
        String displaysha = "SHA";
        String displayMessage = "MESSAGE";

        String name = commitModel.getAuthor();
        String sha = commitModel.getSha();
        String message = commitModel.getMessage();

        String delimeter = "RELNOTES";
        String[] temp = message.split(delimeter);


        holder.name_tv.setText(displayName+" "+name);
        holder.sha_tv.setText(displaysha+" "+sha);
        holder.commit_message_tv.setText(displayMessage+" "+temp[0]);
    }

    @Override
    public int getItemCount() {
        return commitModelList.size();

    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name_tv,commit_message_tv,sha_tv;

        public ViewHolder(View itemView) {
            super(itemView);
            name_tv = itemView.findViewById(R.id.name_tv);
            commit_message_tv = itemView.findViewById(R.id.commit_message_tv);
            sha_tv= itemView.findViewById(R.id.sha_tv);
        }
    }

}
