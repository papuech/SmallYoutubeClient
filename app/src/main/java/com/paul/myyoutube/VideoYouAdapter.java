package com.paul.myyoutube;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Paul on 17/03/2017.
 */

public class VideoYouAdapter extends RecyclerView.Adapter<VideoYouAdapter.MyViewHolder> {

    VideoYou videos = new VideoYou();

    public VideoYouAdapter (VideoYou videos){
        this.videos = videos;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        //on chope la bonne video
        VideoYou.ItemsBean item = videos.getItems().get(position);
        holder.bind(item);


    }

    @Override
    public int getItemCount() {
        return videos.getItems().size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titre, description;
        ImageView miniature;

        public MyViewHolder(View itemView) {
            super(itemView);
            titre = (TextView)itemView.findViewById(R.id.itemTitre);
            description = (TextView)itemView.findViewById(R.id.itemDescription);
        }

        public void bind(final VideoYou.ItemsBean item){
            //on envoie les données dans le list_layout
            //titre
            titre.setText(item.getSnippet().getTitle());
            //description
            description.setText(item.getSnippet().getDescription());
            // miniature ERROR
            //String minUrl = item.getSnippet().getThumbnails().getDefaultX().getUrl();
            //Picasso.with(holder.description.getContext()).load(minUrl).into(holder.miniature);

            //---------------------------------------------------

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override public void onClick(View v){
                    //PLAN 1 >> Envoyer toutes les infos sur une autre activity avec le player intégré
                    Intent intent = new Intent(v.getContext(), Details.class);
                    //intent.putExtra("element_date", item.getSnippet().getPublishedAt());
                    intent.putExtra("element_titre", item.getSnippet().getTitle());
                    intent.putExtra("element_desc", item.getSnippet().getDescription());
                    intent.putExtra("element_date", item.getSnippet().getPublishedAt());
                    intent.putExtra("element_id", item.getId().getVideoId());
                    v.getContext().startActivity(intent);



                }
            });

        }


    }
}
