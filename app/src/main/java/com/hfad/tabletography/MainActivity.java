package com.hfad.tabletography;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{

            TabletographyDatabaseMongo db = new TabletographyDatabaseMongo();
            URL postsUrl = new URL(db.getCollectionUrl("posts"));

            HttpURLConnection connection = (HttpURLConnection) postsUrl
                    .openConnection();
            connection.setRequestMethod("GET");
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type",
                    "application/json");
            connection.setRequestProperty("Accept", "application/json");
            

        } catch(Exception e){

        }
    }
}
