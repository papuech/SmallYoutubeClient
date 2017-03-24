package com.paul.myyoutube;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private String currentSearch;

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    VideoYou videos;
    AsyncHttpClient client;
    Gson gson;
    int setResults = 25;
    Spinner number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DECLARATION ELEMENTS
        final ProgressBar spinner = (ProgressBar)findViewById(R.id.progressBar1);
        spinner.setVisibility(View.GONE);
        final Button button = (Button) findViewById(R.id.searcher);
        final EditText searchBox = (EditText)findViewById(R.id.searchBox);
        final RecyclerView recyclerView = (RecyclerView)findViewById(R.id.myRecyclerView);

        number = (Spinner)findViewById(R.id.setResults);
        Integer[] items = new Integer[]{5,15,25,50};
        ArrayAdapter<Integer> intAdapter = new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_item, items);
        number.setAdapter(intAdapter);
        //number.setSelection(0);
        number.setOnItemSelectedListener(this);

        final ImageView imageTest = (ImageView)findViewById(R.id.testimage);

        //CHECK INTERNET
        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            Toast.makeText(this, "Connected", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Disconnected", Toast.LENGTH_SHORT).show();
        }

        //LISTENERS
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                spinner.setVisibility(View.VISIBLE);
                currentSearch = String.valueOf(searchBox.getText());
                //setResults = number.getv
                //log.v("laVariable", currentSearch);
                if(currentSearch != null && !currentSearch.isEmpty()){

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
                            recyclerView.setAdapter(adapter);
                            spinner.setVisibility(View.GONE);
                        }

                        @Override
                        public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                            Toast.makeText(MainActivity.this, "onFailure", Toast.LENGTH_SHORT).show();
                        }
                    });

                }
                else{
                    Toast.makeText(MainActivity.this, "Empty search", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public String setURL(String word){
        word =  "https://www.googleapis.com/youtube/v3/search?part=snippet&q="+word+"&type=video&maxResults="+setResults+"&key=AIzaSyAwTis3xA3KtQ3TPvx61EUYSA_rb8m7F3w";
        return word;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        setResults = Integer.getInteger(adapterView.getItemAtPosition(i).toString());
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
