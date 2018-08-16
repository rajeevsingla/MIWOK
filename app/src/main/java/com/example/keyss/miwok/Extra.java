package com.example.keyss.miwok;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Extra extends AppCompatActivity{




    public void more_knowledge(View view) {
        Intent k = new Intent(this, knowledge_page.class);
        startActivity(k);


    }


/// to send e-mail

    public void mail_send(View view) {

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rajeev25singla25@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Miwok application");
        intent.putExtra(Intent.EXTRA_TEXT, "Miwok app by Rajeev ");
        if (
                intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


    }

    //to move to the about page
    public void about_page(View view) {
        Intent p = new Intent(this, about_app.class);
        startActivity(p);
    }


    //to move to sig in page
    public void sign_in(View view) {
        Intent s = new Intent(this, sign_in.class);
        startActivity(s);

    }








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);

        setContentView(R.layout.avtivity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new aboutFragment())
                .commit();
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.scrool, new aboutFragment())
//                .commit();
    }






}
