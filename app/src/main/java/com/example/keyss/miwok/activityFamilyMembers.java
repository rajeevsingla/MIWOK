package com.example.keyss.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;

import android.view.View;
import android.widget.*;

public class activityFamilyMembers extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        setContentView(R.layout.avtivity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new FamilyFragment())
                .commit();

    }
}
