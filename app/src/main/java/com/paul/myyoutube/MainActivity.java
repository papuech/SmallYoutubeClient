package com.paul.myyoutube;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    private String currentSearch;

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    VideoYou videos;
    AsyncHttpClient client;
    Gson gson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DECLARATION ELEMENTS
        final ProgressBar spinner = (ProgressBar)findViewById(R.id.progressBar1);
        spinner.setVisibility(View.GONE);
        final Button button = (Button) findViewById(R.id.searcher);
        final EditText searchBox = (EditText)findViewById(R.id.searchBox);
        final TextView message = (TextView)findViewById(R.id.message);
        final RecyclerView recyclerView = (RecyclerView)findViewById(R.id.myRecyclerView);
        final ImageView imageTest = (ImageView)findViewById(R.id.testimage);

        //CHECK INTERNET
        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            message.setText("Connected");
        } else {
            message.setText("Not Connected");
        }

        //LISTENERS
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                spinner.setVisibility(View.VISIBLE);
                currentSearch = String.valueOf(searchBox.getText());
                //log.v("laVariable", currentSearch);
                if(currentSearch != null && !currentSearch.isEmpty()){

                    message.setText(currentSearch);

                    layoutManager = new LinearLayoutManager(MainActivity.this);
                    recyclerView.setLayoutManager(layoutManager);
                    recyclerView.setHasFixedSize(true);

                    //on doit remplir videos avec une VideoYou

                    client = new AsyncHttpClient();
                    client.get(MainActivity.this, setURL(currentSearch), new AsyncHttpResponseHandler() {
                        @Override
                        public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {

                            String responsestr = new String(responseBody);
                            gson = new Gson();
                            videos = gson.fromJson(responsestr, VideoYou.class);
                            adapter = new VideoYouAdapter(videos);
                            message.setText("ok");
                            recyclerView.setAdapter(adapter);
                            spinner.setVisibility(View.GONE);
                        }

                        @Override
                        public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                            message.setText("onFailure");
                        }
                    });

                }
                else{
                    message.setText("Empty search");
                }
            }
        });
    }

    public String setURL(String word){
        word =  "https://www.googleapis.com/youtube/v3/search?part=snippet&q="+word+"&type=video&maxResults=25&key=AIzaSyAwTis3xA3KtQ3TPvx61EUYSA_rb8m7F3w";
        return word;
    }
}
