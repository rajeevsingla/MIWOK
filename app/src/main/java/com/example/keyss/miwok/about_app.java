package com.example.keyss.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;
import android.view.*;
import android.content.Intent;

public class about_app extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);




        Toast toast=Toast.makeText(getApplicationContext(),"About this application ",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);

        toast.show();





    }

    public void back_main(View view)
    {
        Intent b=new Intent(this,MainActivity.class);
        startActivity(b);
    }
}
