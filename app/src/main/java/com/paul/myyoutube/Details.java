package com.paul.myyoutube;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;


public class Details extends YouTubeBaseActivity {


    public static final String API_KEY = "AIzaSyAwTis3xA3KtQ3TPvx61EUYSA_rb8m7F3w";
    public String VIDEO_ID = "_Yhyp-_hX2s";
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // RECUPERATION DES DONNEES
        TextView titre = (TextView)findViewById(R.id.titre);
        TextView description = (TextView)findViewById(R.id.description);
        TextView date = (TextView)findViewById(R.id.date);

        Intent intent = getIntent();
        VIDEO_ID = intent.getStringExtra("element_id");
        titre.setText(intent.getStringExtra("element_titre"));
        description.setText(intent.getStringExtra("element_desc"));
        date.setText("Mise en ligne le : "+intent.getStringExtra("element_date"));


        /** Initializing YouTube Player View **/
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.player);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationFailure(Provider provider, YouTubeInitializationResult result) {
                Toast.makeText(Details.this, "Faillure !", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {
                player.loadVideo(VIDEO_ID);
            }
        };
        youTubePlayerView.initialize(API_KEY, onInitializedListener);

    }
}

