package com.example.voting;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        TextView textView = findViewById(R.id.candi);

        Intent intent = getIntent();
        String name = intent.getExtras().getString("user_name");
        String id = intent.getExtras().getString("user_id");
        String candidate = intent.getExtras().getString("candi_name");
        String vote = intent.getExtras().getString("vote_cnt");

        String str = "ID: " + id + ", " + name + " voted for " + candidate + " with total vote " + vote;

        textView.setText(str);

    }

    protected void onDestroy(){

        super.onDestroy();
        Log.d("Main activity2", "onDestroy: 2");

    }

    protected void onPause(){
        super.onPause();
        Log.d("Main activity2", "onPause: 2");

    }

    protected void onStart(){
        super.onStart();
        Log.d("Main activity2", "onStart: 2");

    }

    protected void onStop(){

        super.onStop();
        Log.d("Main Activity2", "onStop: 2");
    }

    protected void onRestart(){
        super.onRestart();

        Log.d("Main Activity2", "onRestart: 2");
    }

    protected void onResume(){
        super.onResume();

        Log.d("Main Activity2", "onResume:2 ");
    }

}
