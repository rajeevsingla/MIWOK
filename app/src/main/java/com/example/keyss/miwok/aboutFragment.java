package com.example.keyss.miwok;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.*;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.ListView;
import java.lang.*;
import android.widget.*;
import android.view.View.OnClickListener;


import java.util.ArrayList;

public class aboutFragment extends Fragment {

    private View view;

    //to move to more knowledge
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup contanier,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_extra, contanier, false);


        Button b = (Button) rootView.findViewById(R.id.button);
        b.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), knowledge_page.class);
                startActivity(intent);

            }

        });

        Button d = (Button) rootView.findViewById(R.id.mail);


        d.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rajeev25singla25@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Miwok application");
                intent.putExtra(Intent.EXTRA_TEXT, "Miwok app by Rajeev ");

                    startActivity(intent);


            }

        });

        ImageButton img = (ImageButton) rootView.findViewById(R.id.imgbtn);
        img.setOnClickListener(new OnClickListener() {


            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rajeev25singla25@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Miwok application");
                intent.putExtra(Intent.EXTRA_TEXT, "Miwok app by Rajeev ");

                    startActivity(intent);


            }

        });



        TextView e = (TextView) rootView.findViewById(R.id.read_appp);


        e.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), about_app.class);
                startActivity(intent);

            }

        });




        TextView f = (TextView) rootView.findViewById(R.id.text_sign);


        f.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), sign_in.class);
                startActivity(intent);

            }

        });

        ImageView p = (ImageView) rootView.findViewById(R.id.img_sign);


        p.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), sign_in.class);
                startActivity(intent);

            }

        });







// more_knowledge(view);
// mail_send(view);
// about_page(view);
// sign_in(view);
        return rootView;


    }

    public aboutFragment() {

    }


    public void more_knowledge(View view) {
        Intent k = new Intent(getActivity(), knowledge_page.class);
        startActivity(k);


    }


/// to send e-mail


    //to move to the about page
    public void about_page(View view) {
        Intent p = new Intent(getActivity(), about_app.class);
        startActivity(p);
    }


    //to move to sig in page
    public void sign_in(View view) {
        Intent s = new Intent(getActivity(), sign_in.class);
        startActivity(s);

    }


    @Override
    public void onStop() {
        super.onStop();

        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.

    }
}
