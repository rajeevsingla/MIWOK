package com.example.keyss.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.net.*;

public class knowledge_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge_page);




    }
    public void submit(View view)
    {









    }



    public void back_main(View view)
    {
        Intent b=new Intent(this,MainActivity.class);
        startActivity(b);
    }

}
