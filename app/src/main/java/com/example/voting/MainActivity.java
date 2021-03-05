package com.example.voting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    TextView tv;
    TextView tv_name;
    TextView tv_id;
    private int voteCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = findViewById(R.id.spinner2);
        tv_name = findViewById(R.id.name);
        tv_id = findViewById(R.id.name);
    }

    public void accept(View view){
        voteCount++;
    }

    public void vote(View view){

        Intent intent = new Intent(this,Activity2.class);
        intent.putExtra("candidate", sp.getSelectedItem().toString());
        intent.putExtra("name", tv_name.getText().toString());
        intent.putExtra("id", tv_id.getText().toString());
        intent.putExtra("vote", voteCount);

        startActivity(intent);
    }

    protected void onDestroy(){

        super.onDestroy();
        Log.d("Main activity", "onDestroy: 1");

    }

    protected void onPause(){
        super.onPause();
        Log.d("Main activity", "onPause: 1");

    }

    protected void onStart(){
        super.onStart();
        Log.d("Main activity", "onStart: 1");

    }

    protected void onStop(){

        super.onStop();
        Log.d("Main Activity", "onStop: 1");
    }

    protected void onRestart(){
        super.onRestart();

        Log.d("Main Activity", "onRestart: 1");
    }

    protected void onResume(){
        super.onResume();

        Log.d("Main Activity", "onResume:1 ");
    }
}